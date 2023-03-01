package com.example.studentmanagementsping.reponsitory;

import com.example.studentmanagementsping.modle.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentReponsitory extends JpaRepository<Student, Integer> {

    @Query(value = "SELECT stu FROM Student stu")
    List<Student> getStudent();

    @Query(value = "SELECT stu FROM Student stu WHERE stu.id = ?1")
    Student getStudentById(int id);

    @Query(value = "SELECT stu FROM Student stu WHERE stu.name = ?1 and stu.score = ?2")
    Student getStudentByNameAndScore(String name,int score);
}
