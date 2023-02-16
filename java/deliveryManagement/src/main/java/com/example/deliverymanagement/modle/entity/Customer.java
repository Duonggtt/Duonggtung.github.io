package com.example.deliverymanagement.modle.entity;

import jakarta.persistence.*;
import lombok.Data;

@Table(name = "customer")
@Entity
@Data
public class Customer {
    @Id
    private int id;
    private String name;
    private String phone;
    Wallet wallet;
}
