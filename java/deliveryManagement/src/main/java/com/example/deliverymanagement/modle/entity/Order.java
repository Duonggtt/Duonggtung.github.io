package com.example.deliverymanagement.modle.entity;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

import java.util.List;

@Table(name = "order")
@Entity
@Data
public class Order {
    @Id
    private int id;
    Customer customer;
    private int price;
    private String status;
    Shipper sipper;
    private String address;
    private String time_order;
    private String estimate_time;
    List<Product> productList;
}
