package com.lxf.springbootmybatis.mapper;


import com.lxf.springbootmybatis.pojo.StudentInfo;
import com.lxf.springbootmybatis.pojo.StudentInfoExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface StudentInfoMapper {
    long countByExample(StudentInfoExample example);

    int deleteByExample(StudentInfoExample example);

    int deleteByPrimaryKey(Integer stuId);

    int insert(StudentInfo record);

    int insertSelective(StudentInfo record);

    List<StudentInfo> selectByExample(StudentInfoExample example);

    StudentInfo selectByPrimaryKey(Integer stuId);

    int updateByExampleSelective(@Param("record") StudentInfo record, @Param("example") StudentInfoExample example);

    int updateByExample(@Param("record") StudentInfo record, @Param("example") StudentInfoExample example);

    int updateByPrimaryKeySelective(StudentInfo record);

    int updateByPrimaryKey(StudentInfo record);
}