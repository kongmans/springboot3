package com.kong.boot.controller;

import com.kong.boot.pojo.Person;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

//@ResponseBody
//@Controller
@RestController
public class helloController {
//
//    @GetMapping("/hello")
//    public String  hello(){
//        return "hello,sprint boot 3";
//
//    }

    @GetMapping("/person")
    public Person person(Model model){
        Person person = new Person();
        person.setId(10l);
        person.setName("kongman");
        person.setAge(18);
        person.setEmail("132456@qq.com");
        person.setRole("admin");
        model.addAttribute("person",person);
        return person;
    }








}
//