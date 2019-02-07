package com.lxf.springbootmybatis.service;

import com.github.pagehelper.PageHelper;
import com.lxf.springbootmybatis.mapper.StudentInfoMapper;
import com.lxf.springbootmybatis.pojo.StudentInfo;
import com.lxf.springbootmybatis.pojo.StudentInfoExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


@Service
@Transactional
public class StudentServiceImpl implements StudentService{

    @Autowired
    private StudentInfoMapper studentInfoMapper;

    @Override
    public StudentInfo findStudentInfo(Integer stuId) {
        return studentInfoMapper.selectByPrimaryKey(stuId);
    }

    @Override
    public List<StudentInfo> findAllStudentsInfo(int pageNum, int pageSize) {
        StudentInfoExample studentInfoExample = new StudentInfoExample();
        StudentInfoExample.Criteria criteria = studentInfoExample.createCriteria();
        PageHelper.startPage(pageNum,pageSize);
        //PageHelper.startPage(1, 2, true);
        return studentInfoMapper.selectByExample(studentInfoExample);
    }
}
