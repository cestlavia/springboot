package com.springboot.study;

import org.apache.catalina.filters.RemoteIpFilter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class WebConfiguration {


    @Bean
    public RemoteIpFilter getRemoteIpFilter() {
        return new RemoteIpFilter();
    }

}
