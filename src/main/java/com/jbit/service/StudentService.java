package com.jbit.service;

import com.jbit.entity.Student;

import java.util.List;

public interface StudentService {
    List<Student> findAllStudent();

    int insertStudent(Student student);
}
