package com.springboot.study.service;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.springboot.study.service.ws.ArrayOfString;
import com.springboot.study.service.ws.MobileCodeWS;
import com.springboot.study.service.ws.MobileCodeWSSoap;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service("mobileService")
public class MobileService {
    private static Logger log = LoggerFactory.getLogger(MobileService.class);

    public String getMobileLocalInfo(String mobileNo) {
        String localInfo = null;
        try {

            // 创建webService
            MobileCodeWS ws = new MobileCodeWS();
            // 获取代理对象
            MobileCodeWSSoap mobileCodeWSSoap = null;
            try {
                mobileCodeWSSoap = ws.getMobileCodeWSSoap();
            } catch (Exception e) {
                log.error("获取WebService服务失败！");
            }

            // 调用服务端方法
            localInfo = mobileCodeWSSoap.getMobileCodeInfo(mobileNo, null);
            ObjectMapper o = new ObjectMapper();
            log.info("Soap : " + o.writeValueAsString(mobileCodeWSSoap));
            ArrayOfString databaseInfo = mobileCodeWSSoap.getDatabaseInfo();
            log.info("DataBaseInfo : " + o.writeValueAsString(databaseInfo));

        } catch (Exception e) {
            log.error(e.getMessage(), e);
        }
        return localInfo;
    }

    /*public static void main(String[] args) {
        MobileCodeWS ws = new MobileCodeWS();
        MobileCodeWSSoap soap = ws.getMobileCodeWSSoap();
        String mobileCodeInfo = soap.getMobileCodeInfo("18501580123", null);
        System.out.println(mobileCodeInfo);
    }*/
}
