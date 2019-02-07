/**
 * Copyright (C), 2015-2018, XXX有限公司
 */
package com.lxf.spring.dto;


/**
 * <pre>
 * @FileName:    Student
 * @Author:      李晓福
 * @Date:        2018/11/17 23:12
 * @Description: Student
 * @since:       1.0.0
 * @History:
 * 作者姓名       修改时间             版本号           描述
 * lxf           2018/11/17 23:12     1.0.0           创建
 * </pre>
 */
 
public class Student {

    private Integer age;
    private String name;
    private Integer id;

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Student{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", id=" + id +
                '}';
    }
}
