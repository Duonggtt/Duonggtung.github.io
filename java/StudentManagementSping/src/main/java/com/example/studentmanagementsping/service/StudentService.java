package com.example.studentmanagementsping.service;

import com.example.studentmanagementsping.modle.entity.Student;

import java.util.List;

public interface StudentService {
    List<Student> getStudent();

    Student getStudentById(int id);

    Student getStudentByNameAndScore(String name, int score);

}
