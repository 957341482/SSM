package com.jbit.service.impl;

import com.jbit.entity.Student;
import com.jbit.mapper.StudentMapper;
import com.jbit.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service("studentService")
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentMapper studentMapper;

    @Override
    public List<Student> findAllStudent() {
        return studentMapper.findAllStudent();
    }

    @Override
    public int insertStudent(Student student) {
        return studentMapper.insertStudent(student);
    }
}
