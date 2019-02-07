/**
 * Copyright (C), 2015-2018, XXX有限公司
 */
package com.lxf.controller;

import com.lxf.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import per.lxf.webmvc.stereotype.Autowired;
import per.lxf.webmvc.stereotype.Controller;
import per.lxf.webmvc.stereotype.RequestMapping;
import per.lxf.webmvc.stereotype.RequestParam;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * <pre>
 * @author:      李晓福
 * @date:        2018/12/17 19:37
 * @description: 
 * @since:       1.0.0
 * @history:
 * 作者姓名       修改时间             版本号           描述
 * lxf           2018/12/17 19:37     1.0.0           创建
 * </pre>
 */

@Controller
public class UserController {

    private Logger logger = LoggerFactory.getLogger(UserController.class);

    @Autowired
    private UserService userService;

    @RequestMapping("/login.do")
    public String login(@RequestParam("name")String name, @RequestParam("age")Integer age, HttpServletRequest request, HttpServletResponse response) {
        logger.info("name={}", name);
        logger.info("age={}", request.getParameter("age"));
        logger.info("{}", userService.login(name));
        return "<h1>" + name + "</h1>";
    }

    @RequestMapping("/logout.do")
    public String logout(HttpServletResponse response) {
        return "<h1>logout</h1>";
    }
}
