package com.momoka.marsdemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import com.momoka.marsdemo.dao.User;

@Controller
@RequestMapping("/")
public class UserController {

    @RequestMapping("")
    public ModelAndView home(@RequestParam String name, Integer num) {
        User user = new User();

        ModelAndView modelMap = new ModelAndView();
        modelMap.addObject("name", );
        modelMap.setViewName("user");
        return modelMap;
    }


}
