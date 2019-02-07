package com.webapp.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

//注解控制器
@Controller
public class ItemsController3 {

    @RequestMapping("/add")
    public void add() {
        System.out.println("add");
    }

    @RequestMapping("/query")
    public void query() {
        System.out.println("query");
    }

    @RequestMapping("/delete")
    public void delete() {
        System.out.println("delete");
    }
}
