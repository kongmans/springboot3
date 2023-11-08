package com.kong.ssm.controller.user;

import com.kong.ssm.mapper.UserMapper;
import com.kong.ssm.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;


@RestController
public class UserController {
    @Autowired
    UserMapper userMapper;

    @GetMapping("/user/{id}")
    public User findOne(@PathVariable("id") long id) {
        return userMapper.getUserById(id);

    }

    //
    @GetMapping("/users")
    public List<User> findAll() {
        return userMapper.getUsers();


    }


    @GetMapping("/add")
    public User insert() {
        User user = new User();
        user.setUserName("张三");
        user.setUserPassword("123456");
        userMapper.addUser(user);
        return user;
    }









}

