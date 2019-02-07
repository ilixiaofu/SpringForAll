package com.lxf.springbootdemo.controller;

import com.lxf.springbootdemo.entity.Person;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
@RequestMapping("/html")
public class ThymeleafController {

    @RequestMapping("/index")
    public String htmlView(@RequestParam String id, ModelMap mMap){
        System.out.println("htmlView");
        Person person = new Person();
        person.setId(id);
        person.setName("jerry");
        mMap.addAttribute("person", person);
        return "index";
    }

    //    @CrossOrigin(origins = "http://127.0.0.1:8080")
    @RequestMapping("/{id}/{name}")
    public String pathView(@PathVariable String id, @PathVariable String name, ModelMap mMap){
        System.out.println("pathView");
        Person person = new Person();
        person.setId(id);
        person.setName(name);
        person.setBrief("<span>text</span>");
        mMap.addAttribute("person", person);
        return "index";
    }
}
