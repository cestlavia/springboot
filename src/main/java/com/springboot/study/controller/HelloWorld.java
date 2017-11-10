package com.springboot.study.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.springboot.study.entity.TicketOD;
import com.springboot.study.service.TicketService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

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
            log.info("tickeOD infos ：" + mapper.writeValueAsString(tos));
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
}
