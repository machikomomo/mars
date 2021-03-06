package com.momoka.marsdemo.controller;

import com.momoka.marsdemo.dao.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/user")
public class UserController {

    @RequestMapping("")
    public ModelAndView home(@RequestParam String name, Integer num) {
        User user = new User();
        user.setName("akira");
        user.setPasswd("123456");

        ModelAndView modelMap = new ModelAndView();
        modelMap.addObject("user", user);
        modelMap.setViewName("user");
        return modelMap;
    }


}
