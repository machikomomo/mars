package com.momoka.marsdemo.rest;

import com.momoka.marsdemo.dao.UserDao;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.websocket.server.PathParam;

@RestController
@RequestMapping("/rest/user")
public class UserRestController {

    @Resource
    private UserDao userDao;

    @PostMapping("/delete")
    private Boolean deleteUser(@RequestParam Long id) {

        int result = userDao.deleteByPrimaryKey(id);
        return result > 0;
    }
}
