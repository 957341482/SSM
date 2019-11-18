package com.jbit.mapper;

import com.jbit.entity.Student;

import java.util.List;

public interface StudentMapper {
    List<Student> findAllStudent();

    int insertStudent(Student student);
}
