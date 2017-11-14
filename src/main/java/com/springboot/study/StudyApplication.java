package com.springboot.study;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 注解@MapperScan扫描制定路径的所有Mapper，不用在每个Mapper文件上加注解@Mapper
 */
@SpringBootApplication
@MapperScan("com.springboot.study.service.dao")
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
