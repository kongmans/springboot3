package com.kong.boot.controller;

import com.kong.boot.pojo.Person;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


import java.util.Arrays;
import java.util.List;

@Controller
public class personController {
//    @GetMapping("/list")
//     public String list(Model model){
//        List<Person> list = Arrays.asList(
//                new Person(1L,"zhangsan",15,"123456@qq.com","km"),
//                new Person(1L,"lisi",15,"123456@qq.com","km"),
//                new Person(1L,"wangwu",15,"123456@qq.com","km"),
//                new Person(1L,"zhaoliu",15,"123456@qq.com","km"),
//                new Person(1L,"liubei",15,"123456@qq.com","admin"),
//                new Person(1L,"zhangfei",15,"123456@qq.com","km"),
//                new Person(1L,"guanyu",15,"123456@qq.com","km")
//        );
//        model.addAttribute("person",list);
//        return "list";
//    }



    @GetMapping("/person")
    public String person(Model model){
        Person person = new Person();
        person.setId(10l);
        person.setName("kongman");
        person.setAge(18);
        person.setEmail("132456@qq.com");
        person.setRole("admin");
        model.addAttribute("person",person);
        return "person";
    }
}
