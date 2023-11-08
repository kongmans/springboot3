package com.kong.ssm.controller;

import com.kong.ssm.mapper.UserMapper;
import com.kong.ssm.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import java.util.List;


@Controller


public class ModelController {
    @Autowired
    UserMapper userMapper;

    @GetMapping("/dashboard")
    public String dashboard(Model model){
        //存入数据
        model.addAttribute("msg","Hello,Thymeleaf");
        //classpath:/templates/dashboard.html
        return "dashboard";
    }



    @GetMapping("/admin")
    public String list(Model model){
        List<User> users = userMapper.getUsers();
        //存入数据
        model.addAttribute("users",users);
        //classpath:/templates/dashboard.html
        return "admin";
    }


}
