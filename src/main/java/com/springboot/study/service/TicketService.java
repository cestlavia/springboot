package com.springboot.study.service;

import com.springboot.study.entity.TicketOD;
import com.springboot.study.service.dao.TicketODMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.util.List;

@Service("ticketService")
public class TicketService {

    private static Logger log = LoggerFactory.getLogger(TicketService.class);

    @Autowired
    private TicketODMapper ticketODMapper;

    @Autowired
    private StringRedisTemplate stringRedisTemplate;

    @Autowired
    private RedisTemplate redisTemplate;

    public TicketOD getTicketODByTicketId(Long ticketId) throws Exception {
        return ticketODMapper.getByTicketId(ticketId);
    }

    public List<TicketOD> getTicketListByOd(Long od) throws Exception {
        return ticketODMapper.getByOd(od);
    }


    public String getFromRedis(String str) {
        try {
/*
            Object o = redisTemplate.opsForValue().get(str);
            if (o instanceof String) {
                log.info(o.toString());
            }
*/
            ValueOperations<String, String> vops = redisTemplate.opsForValue();
            vops.get(str);
            /* 报错 Could not read JSON: Unexpected token (START_OBJECT), expected START_ARRAY: need JSON Array to contain As.WRAPPER_ARRAY type information for class java.lang.Object*/
        } catch (Exception e) {
            log.error(e.getMessage(), e);
        }


        String value = null;
        try {
            value = stringRedisTemplate.opsForValue().get(str);
        } catch (Exception e) {
            log.error(e.getMessage());
        }
        return StringUtils.isEmpty(value) ? "null" : value;
    }
}
