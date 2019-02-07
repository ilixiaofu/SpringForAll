package com.lxf.springbootmybatis.service;

import com.lxf.springbootmybatis.pojo.StudentInfo;

import java.util.List;

public interface StudentService {

    StudentInfo findStudentInfo(Integer stuId);

    List<StudentInfo> findAllStudentsInfo(int pageNum, int pageSize);
}
