package com.webapp.anno;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component(value = "user")
@Scope(value = "prototype") // singleton 单实例    prototype 多实例
public class User {
    public void add() {
        System.out.println("add...");
    }
}
