package com.springboot.study.controller;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.util.JSONPObject;
import com.springboot.study.entity.TicketOD;
import com.springboot.study.service.TicketService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@RestController
public class HelloWorld {

    private static Logger log = LoggerFactory.getLogger(HelloWorld.class);

    @Autowired
    private TicketService ticketService;

    @RequestMapping("/hello")
    public String index() {
        log.info("i am a slf4j Log");
        return "hello Spring boot";
    }

    @RequestMapping("/hello/{name}")
    public String test(@PathVariable String name) {
        Long ticketId = 1375l;

        try {
            List<TicketOD> tos =ticketService.getTicketListByOd(577L);
            ObjectMapper mapper = new ObjectMapper();
            // 将查询结果对象转换为json字符串
            log.info("tickeOD infos ：" + mapper.writeValueAsString(tos));
            TicketOD ticketODByTicketId = ticketService.getTicketODByTicketId(123L);
            TicketOD ticketODByTicketId1 = ticketODByTicketId;
            Long planeTicketId = ticketODByTicketId1.getPlaneTicketId();
            TicketOD od = ticketService.getTicketODByTicketId(ticketId);
            if (od != null) {
                log.info(od.getPlaneOdId() + ": Plane OD id");
            }
        } catch (Exception e) {
            log.error("method[getTicketODByTicketId] error!!!");
            e.printStackTrace();
        }
        return name + "SpringBoot";
    }


    @RequestMapping("/hello/redis")
    public String redistest() {
        return ticketService.getFromRedis("AUIDT_ORDER:6540");
    }
    public static void main(String[] args) {
        System.out.println();
        Random r = new Random(100);
        for (int j = 0; j < r.nextInt(); j++) {

        }

        for (int i = 0; i < r.nextInt(); i++) {
            System.getenv();

        }
        List<String> strs = new ArrayList<>();
        for (String str : strs) {

        }

    }
}
