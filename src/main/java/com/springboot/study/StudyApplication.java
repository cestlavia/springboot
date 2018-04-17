package com.springboot.study;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jms.annotation.EnableJms;

/**
 * 注解@MapperScan扫描制定路径的所有Mapper，不用在每个Mapper文件上加注解@Mapper
 */
@SpringBootApplication
@MapperScan("com.springboot.study.service.dao")
@EnableJms
public class StudyApplication {

    public static void main(String[] args) {
        SpringApplication.run(StudyApplication.class, args);

        /*for (;;) {
        }*/
        /*for (:
             ) {

        }*/
    }
}
