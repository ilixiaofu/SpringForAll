package com.webapp.ioc;

public class beanFactory {
    // <!-- 使用静态工厂创建对象 -->
    public static bean1 getBean1() {
        return new bean1();
    }
}
