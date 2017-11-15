package com.springboot.study.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import javax.websocket.*;
import javax.websocket.server.ServerEndpoint;
import java.io.IOException;
import java.util.concurrent.CopyOnWriteArraySet;

/**
 * springboot的webSocket要@Component声明下;使用独立容器是由容器自己管理websocket的，但在springboot中连容器都是spring管理的。
 *
 * \@Component默认是单例模式的，但springboot还是会为每个websocket连接初始化一个bean，所以可以用一个静态set保存起来。
 */
@ServerEndpoint(value = "/websocket")
@Component
public class WebSocketServer {


    private static Logger log = LoggerFactory.getLogger(WebSocketServer.class);

    private static int onlineCnt = 0;
    private static CopyOnWriteArraySet<WebSocketServer> socketServerset = new CopyOnWriteArraySet<>();
    private Session session;

    @OnOpen
    public void onOpen(Session session) {
        this.session = session;
        socketServerset.add(this);
        addOnlineCount();
        log.info("有新的连接加入！");
        try {
            sendMessage("onOpen......");
        } catch (Exception e) {
        }
    }

    @OnClose
    public void onClose() {
        socketServerset.remove(this);
        subOnlineCount();
        log.info("有连接关闭了！");
    }


    /**
     * 收到客户端发送的消息后的处理
     * @param message
     * @param session
     */
    @OnMessage
    public void onMessage(String message, Session session) {
        log.info("来自客户端的消息:" + message);

        //群发消息
        for (WebSocketServer item : socketServerset) {
            try {
                item.sendMessage(message);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
    @OnError
    public void onError(Session session, Throwable error) {
        log.info("发生错误", error);
        error.printStackTrace();
    }

    public void sendMessage(String message) throws IOException {
        this.session.getBasicRemote().sendText(message);
        //this.session.getAsyncRemote().sendText(message);
    }


    public static synchronized int getOnlineCnt() {
        return onlineCnt;
    }

    public static synchronized void addOnlineCount() {
        onlineCnt++;
    }

    public static synchronized void subOnlineCount() {
        onlineCnt--;
    }

}
