package com.example.studentmanagementsping.modle.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    @Column(name = "birth_date")
    private String birthDate;
    private int score;
}
