package com.springboot.study;

import org.apache.catalina.filters.RemoteIpFilter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class WebConfiguration {

    private static Logger log = LoggerFactory.getLogger(WebConfiguration.class);

    @Bean
    public RemoteIpFilter getRemoteIpFilter() {
        log.error("RemoteIpFilter executed");
        return new RemoteIpFilter();
    }


}
