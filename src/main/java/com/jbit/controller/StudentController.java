package com.jbit.controller;

import com.jbit.entity.Student;
import com.jbit.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;
import java.util.List;

@RestController
@RequestMapping("/student")
public class StudentController {

    @Autowired
    @Qualifier("studentService")
    private StudentService studentService;

    @RequestMapping("/findAll")
    public List<Student> findAll(){
          List<Student> list = studentService.findAllStudent();
        return  list;
    }

    @RequestMapping("/insertStu")
    public int insertStu(Student student){
        System.out.println("接收到的数据是:"+student);
        return studentService.insertStudent(student);

    }
}
