package com.example.studentmanagementsping.controller;

import com.example.studentmanagementsping.modle.entity.Student;
import com.example.studentmanagementsping.reponsitory.StudentReponsitory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class StudentController {

    @Autowired
    public StudentReponsitory studentReponsitory;

    @GetMapping(value = "/student/all")
    public ResponseEntity<List<Student>> getStudent() {
        return ResponseEntity.status(HttpStatus.OK).body(studentReponsitory.getStudent());
    }
    @GetMapping(value = "/student/byId")
    public ResponseEntity<Student> getStudentById(int id) {
        return ResponseEntity.status(HttpStatus.OK).body(studentReponsitory.getStudentById(id));
    }

    @GetMapping(value = "/student/byNameAdnScore")
    public ResponseEntity<Student> getStudentByNameAndScore(@RequestParam("name") String name, @RequestParam("score") int score) {
       Student student = studentReponsitory.getStudentByNameAndScore(name,score);
       return ResponseEntity.ok(student);
    }

}
