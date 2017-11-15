package com.springboot.study.vo;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

/**
 * /@ConfigurationProperties注解要依赖spring-boot-configuration-processor这个jar/
 */
@Component
@ConfigurationProperties(prefix = "book")
@PropertySource("classpath:book.properties")
public class Book {
    private String name;
    private String author;

    public String getName() {
        return name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setName(String name) {
        this.name = name;
    }
}
