package com.momoka.marsdemo.controller;

import com.momoka.marsdemo.dao.User;
import com.momoka.marsdemo.dao.UserDao;
import com.momoka.marsdemo.dao.UserExample;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import java.util.List;

@Controller
@RequestMapping("/user")
public class UserController {

    @Resource
    private UserDao userDao;

    @RequestMapping("")
    public ModelAndView home(Long id,Long idDel) {
        UserExample example = new UserExample();
        example.createCriteria();
        List<User> userList = userDao.selectByExample(example);

//        User user = userDao.selectByPrimaryKey(id);
//        userDao.deleteByPrimaryKey(idDel);
//        User user = new User();
//        user.setName("akira");
//        user.setPasswd("123456");

        ModelAndView modelMap = new ModelAndView();
        modelMap.addObject("userList", userList); //返回前端
        modelMap.setViewName("user");
        return modelMap;
    }


}
