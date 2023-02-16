package com.example.deliverymanagement.modle.entity;

import jakarta.persistence.*;
import lombok.Data;

@Table(name = "wallet")
@Entity
@Data
public class Wallet {
    @Id
    private int id;
    @Column(name = "account_number")
    private String accountNum;
    private int balance;
}
