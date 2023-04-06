package com.example.demotest.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table
public class Wallet {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String accountNumber;
    private double balance;
}
