package com.momoka.marsdemo.rest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * M V C
 * Model View Controller
 * annotation 声明 注解
 */
//@Controller
@RestController
public class HelloController {

//    @RequestMapping("/hello")
//    @GetMapping
    @GetMapping("/hello")
    public String hello(String name, Integer age) {
        return "hello:" + name + ",age:" + age;
    }


}
