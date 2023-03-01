package com.example.studentmanagementsping.service;

import com.example.studentmanagementsping.modle.entity.Student;
import com.example.studentmanagementsping.reponsitory.StudentReponsitory;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class StudentServiceIPL implements StudentService{

    @Autowired
    StudentReponsitory studentReponsitory;
    @Override
    public List<Student> getStudent() {
        List<Student> students = studentReponsitory.findAll();
        return students;
    }

    @Override
    public Student getStudentById(int id) {
        Student student = studentReponsitory.getStudentById(id);
        return student;
    }

    @Override
    public Student getStudentByNameAndScore(String name, int score) {
        Student student = studentReponsitory.getStudentByNameAndScore(name,score);
        return student;
    }
}
