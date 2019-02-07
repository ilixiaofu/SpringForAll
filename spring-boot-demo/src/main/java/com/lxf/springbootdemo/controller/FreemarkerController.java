package com.lxf.springbootdemo.controller;

import com.lxf.springbootdemo.entity.Person;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/ftl")
public class FreemarkerController {
    @RequestMapping("index")
    public String index(@RequestParam String id, ModelMap mMap){
        System.out.println("index");
        Person person = new Person();
        person.setId(id);
        person.setName("jerry");
        mMap.addAttribute("person", person);
        return "index";
    }
}
