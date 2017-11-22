package com.springboot.study.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
@RequestMapping("/test")
public class TestController {


    /*@RequestMapping("/index") // something wrong
    public ModelAndView index(HttpServletRequest request, HttpServletResponse response) {
        return new ModelAndView("/study/index");
    }*/

    @RequestMapping("/health")
    @ResponseBody
    public String health() {
        return "asfasfd---health";
    }
}
