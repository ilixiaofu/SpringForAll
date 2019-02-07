package com.lxf.spring;

import com.lxf.spring.dao.StudentJDBCTemplate;
import com.lxf.spring.dto.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.ArrayList;
import java.util.List;


public class App {
    public static void main(String[] args) {
        ApplicationContext context =
                new ClassPathXmlApplicationContext("spring/application-beans.xml");

        StudentJDBCTemplate studentJDBCTemplate =
                (StudentJDBCTemplate) context.getBean("studentJDBCTemplate");

//        System.out.println("------Records Creation--------");
//        for (int i=0; i <10; ++i) {
//            StringBuffer name = new StringBuffer(0);
//            for (int j=0; j<25; ++j) {
//                char ch = (char) ( (int) ( Math.random() * 58 ) + 65 );
//                name.append( ch );
//            }
//            studentJDBCTemplate.create(name.toString(), (int)(Math.random()*50));
//        }

//        System.out.println("----Updating Record with ID = 2 -----");
//        studentJDBCTemplate.update(2, 19);

        //        System.out.println("----Delete Record with ID = 2 -----");
//        studentJDBCTemplate.delete(2);

//        System.out.println("----Listing Record with ID = 2 -----");
//        Student student = studentJDBCTemplate.getStudent(1);
//        System.out.println(student);
//
//        student = studentJDBCTemplate.getStudent(3);
//        System.out.println(student);


//        System.out.println("------Listing Multiple Records--------");
//        List<Student> students = studentJDBCTemplate.listStudents();
//        for (Student record : students) {
//            System.out.print("ID : " + record.getId());
//            System.out.print(", Name : " + record.getName());
//            System.out.println(", Age : " + record.getAge());
//        }

//        Student student = new Student();
//        student.setId(1);
//        student.setAge(22);
//
//        Student student1 = new Student();
//        student1.setId(3);
//        student1.setAge(22);
//
//        List<Student> students = new ArrayList<Student>();
//        students.add(student);
//        students.add(student1);
//
//        System.out.println(studentJDBCTemplate.batchUpdate(students).length);


    }
}
