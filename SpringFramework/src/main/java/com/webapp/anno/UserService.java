package com.webapp.anno;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;

@Component(value = "userService")
public class UserService {

    //@Autowired // 自动注入
    @Resource(name = "userDao")
    private UserDao userDao;


    public void add() {
        System.out.println("UserService...");
        userDao.add();
    }
}
