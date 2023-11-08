package com.kong.boot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class testController {
//    @GetMapping("/hello")
//    public String well(Model model){
//        model.addAttribute("msg","张三");
//        return "hello";
//    }
    @GetMapping("/hello")
    public String well(@RequestParam("name") String name ,Model model){
        model.addAttribute("msg",name);
        return "hello";
    }
}
