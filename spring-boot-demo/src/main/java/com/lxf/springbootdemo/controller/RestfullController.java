package com.lxf.springbootdemo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rest")
public class RestfullController {

    @RequestMapping()
    public String index() {
        return "" + 1 / 0;
    }
}
