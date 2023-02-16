package com.example.deliverymanagement.modle.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

import java.util.List;

@Table(name = "shiper")
@Entity
@Data
public class Shiper {
    @Id
    private int id;
    private String name;
    private String phone;
    Wallet wallet;
    List<Order> orderList;
}
