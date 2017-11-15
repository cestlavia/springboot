package com.springboot.study.controller;

import com.springboot.study.service.MobileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;

//@RestController("/mobile")

//@Controller

@RestController
@RequestMapping("/mobile")
public class MobileController {

    @Autowired
    private MobileService mobileService;

    @RequestMapping(value = "/local", method = RequestMethod.GET)
//    @ResponseBody
    public String  mobileInfo(HttpServletRequest request, @RequestParam String mobile) {
        return mobileService.getMobileLocalInfo(mobile);
    }


    @RequestMapping("/test")
//    @ResponseBody
    public String test() {

        return "test!";
    }
}
