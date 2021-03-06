package com.momoka.marsdemo.controller;

import com.momoka.marsdemo.dao.User;
import com.momoka.marsdemo.dao.UserDao;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;

@Controller
@RequestMapping("/user")
public class UserController {

    @Resource
    private UserDao userDao;

    @RequestMapping("")
    public ModelAndView home(Long id,Long idDel) {
        User user = userDao.selectByPrimaryKey(id);
        userDao.deleteByPrimaryKey(idDel);
//        User user = new User();
//        user.setName("akira");
//        user.setPasswd("123456");

        ModelAndView modelMap = new ModelAndView();
        modelMap.addObject("user", user);
        modelMap.setViewName("user");
        return modelMap;
    }


}
