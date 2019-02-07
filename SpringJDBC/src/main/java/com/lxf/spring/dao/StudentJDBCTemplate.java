/**
 * Copyright (C), 2015-2018, XXX有限公司
 */
package com.lxf.spring.dao;


import com.lxf.spring.dto.Student;
import com.lxf.spring.mapper.StudentMapper;
import org.springframework.jdbc.core.BatchPreparedStatementSetter;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ParameterizedPreparedStatementSetter;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.jdbc.core.namedparam.SqlParameterSourceUtils;
import org.springframework.jdbc.core.simple.SimpleJdbcCall;

import javax.sql.DataSource;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

/**
 * <pre>
 * @FileName:    StudentJDBCTemplate
 * @Author:      李晓福
 * @Date:        2018/11/17 23:17
 * @Description: StudentJDBCTemplate 
 * @since:       1.0.0
 * @History:
 * 作者姓名       修改时间             版本号           描述
 * lxf           2018/11/17 23:17     1.0.0           创建
 * </pre>
 */
 
public class StudentJDBCTemplate implements StudentDAO{
    private DataSource dataSource;
    private JdbcTemplate jdbcTemplateObject;

    public void setDataSource(DataSource dataSource) {
        this.dataSource = dataSource;
        this.jdbcTemplateObject = new JdbcTemplate(dataSource);
    }

    /**
     * <pre>
     * @Author:      lxf
     * @Description: TODO
     * @Date:        2018/11/18
     * @Param        [name, age]
     * @return:      int
     * </pre>
     */
    @Override
    public int create(String name, Integer age) {
        String SQL = "insert into student (name, age) values (?, ?)";
        System.out.println("Created Record Name = " + name + " Age = " + age);
        return jdbcTemplateObject.update(SQL, name, age);
    }

    /**
     * <pre>
     * @Author:      lxf
     * @Description: TODO
     * @Date:        2018/11/18
     * @Param        [id]
     * @return:      int
     * </pre>
     */
    @Override
    public int delete(Integer id) {
        String SQL = "delete from student where id = ?";
        System.out.println("Deleted Record with ID = " + id);
        return jdbcTemplateObject.update(SQL, id);
    }

    /**
     * <pre>
     * @Author:      lxf
     * @Description: TODO
     * @Date:        2018/11/18
     * @Param        [id]
     * @return:      com.lxf.spring.dto.Student
     * </pre>
     */
    @Override
    public Student getStudent(Integer id) {
        //        String SQL = "select * from student where id = ?";
//        Student student = jdbcTemplateObject.queryForObject(SQL, new Object[] { id }, new StudentMapper());
//        Student student1 = jdbcTemplateObject.queryForObject(SQL, new StudentMapper(), new Object[] { id });


//        SimpleJdbcCall jdbcCall = new SimpleJdbcCall(dataSource).withProcedureName("getStudentRecord");
//        SqlParameterSource in = new MapSqlParameterSource().addValue("in_id", id);
//        Map<String, Object> out = jdbcCall.execute(in);
//        Student student = new Student();
//        student.setId(id);
//        student.setName((String) out.get("out_name"));
//        student.setAge((Integer) out.get("out_age"));

        SimpleJdbcCall jdbcCall = new SimpleJdbcCall(dataSource).withFunctionName("getStudentName");
        SqlParameterSource in = new MapSqlParameterSource().addValue("in_id", id);
        String name = jdbcCall.executeFunction(String.class, in);
        Student student = new Student();
        student.setId(id);
        student.setName(name);

        return student;
    }

    /**
     * <pre>
     * @Author:      lxf
     * @Description: TODO
     * @Date:        2018/11/18
     * @Param        []
     * @return:      java.util.List<com.lxf.spring.dto.Student>
     * </pre>
     */
    @Override
    public List<Student> listStudents() {
        String SQL = "select * from student";
        List<Student> students = jdbcTemplateObject.query(SQL, new StudentMapper());
        return students;
    }

    /**
     * <pre>
     * @Author:      lxf
     * @Description: TODO
     * @Date:        2018/11/18
     * @Param        [id, age]
     * @return:      int
     * </pre>
     */
    @Override
    public int update(Integer id, Integer age) {
        String SQL = "update student set age = ? where id = ?";
        System.out.println("Updated Record with ID = " + id);
        return jdbcTemplateObject.update(SQL, age, id);
    }

    /**
     * <pre>
     * @Author      lxf
     * @Description TODO
     * @Date        2018/11/18
     * @MethdName   batchUpdate
     * @Param       [students]
     * @return      int
     * </pre>
     */
    @Override
    public int[] batchUpdate(List<Student> students) {
//        String SQL = "update student set age = ? where id = ?";
//        int[] updateCounts = jdbcTemplateObject.batchUpdate(SQL, new BatchPreparedStatementSetter() {
//            @Override
//            public void setValues(PreparedStatement preparedStatement, int i) throws SQLException {
//                preparedStatement.setInt(1, students.get(i).getAge());
//                preparedStatement.setInt(2, students.get(i).getId());
//            }
//
//            @Override
//            public int getBatchSize() {
//                return students.size();
//            }
//        });
//        System.out.println("Records updated!");

//        String SQL = "update student set age = :age where id = :id";
//        SqlParameterSource[] batch = SqlParameterSourceUtils.createBatch(students.toArray());
//        NamedParameterJdbcTemplate jdbcTemplateObject = new NamedParameterJdbcTemplate(dataSource);
//        int[] updateCounts = jdbcTemplateObject.batchUpdate(SQL,batch);
//        System.out.println("records updated!");

        String SQL = "update student set age = ? where id = ?";
        int[][] updateCounts = jdbcTemplateObject.batchUpdate(SQL,students,1,
                new ParameterizedPreparedStatementSetter<Student>() {
                    public void setValues(PreparedStatement ps, Student student)
                            throws SQLException {
                        ps.setInt(1, student.getAge());
                        ps.setInt(2, student.getId());
                    }
                });

        return null;
    }


}


