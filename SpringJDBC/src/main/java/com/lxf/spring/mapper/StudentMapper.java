/**
 * Copyright (C), 2015-2018, XXX有限公司
 */
package com.lxf.spring.mapper;


import com.lxf.spring.dto.Student;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * <pre>
 * @FileName:    StudentMapper
 * @Author:      李晓福
 * @Date:        2018/11/17 23:19
 * @Description: StudentMapper 
 * @since:       1.0.0
 * @History:
 * 作者姓名       修改时间             版本号           描述
 * lxf           2018/11/17 23:19     1.0.0           创建
 * </pre>
 */
 
public class StudentMapper implements RowMapper<Student> {
    @Override
    public Student mapRow(ResultSet resultSet, int i) throws SQLException {
//        System.out.println("mapRow >> i = " + i);
        Student student = new Student();
        student.setId(resultSet.getInt("id"));
        student.setName(resultSet.getString("name"));
        student.setAge(resultSet.getInt("age"));
        return student;
    }
}
