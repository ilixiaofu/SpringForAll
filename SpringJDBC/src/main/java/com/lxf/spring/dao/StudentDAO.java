/**
 * Copyright (C), 2015-2018, XXX有限公司
 */
package com.lxf.spring.dao;


import com.lxf.spring.dto.Student;

import java.util.List;
import javax.sql.DataSource;

/**
 * <pre>
 * @FileName:    StudentDAO
 * @Author:      李晓福
 * @Date:        2018/11/17 23:13
 * @Description: StudentDAO
 * @since:       1.0.0
 * @History:
 * 作者姓名       修改时间             版本号           描述
 * lxf           2018/11/17 23:13     1.0.0           创建
 * </pre>
 */
 
public interface StudentDAO {

    public void setDataSource(DataSource ds);

    public int create(String name, Integer age);

    public int delete(Integer id);

    public Student getStudent(Integer id);

    public List<Student> listStudents();

    public int update(Integer id, Integer age);

    public int[] batchUpdate(final List<Student> students);

}
