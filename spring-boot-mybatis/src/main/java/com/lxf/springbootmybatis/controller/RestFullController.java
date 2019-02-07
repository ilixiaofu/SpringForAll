package com.lxf.springbootmybatis.controller;

import com.lxf.springbootmybatis.pojo.StudentInfo;
import com.lxf.springbootmybatis.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/rest")
public class RestFullController {

    @Autowired
    private StudentService studentService;

    @RequestMapping("/stu")
    public StudentInfo queryStu(@RequestParam Integer id){
        System.out.println("queryStu RequestParam:" + id);
        return studentService.findStudentInfo(id);
    }

    @RequestMapping("/stus")
    public List<StudentInfo> queryStus(@RequestParam("n") int pageNum, @RequestParam("s") int pageSize){
        System.out.println("queryStus");
        return studentService.findAllStudentsInfo(pageNum, pageSize);
    }
}
