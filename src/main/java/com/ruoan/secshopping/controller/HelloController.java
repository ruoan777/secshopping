package com.ruoan.secshopping.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: ruoan
 * Date: 2020/12/4 12:22 上午
 * @Description:
 */
@RestController
@RequestMapping(("hello"))
public class HelloController {

    @RequestMapping("/hello")
    public String hello() {
        return "hello";
    }
}
