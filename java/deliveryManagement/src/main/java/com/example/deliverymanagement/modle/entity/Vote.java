package com.example.deliverymanagement.modle.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Table(name = "vote")
@Entity
@Data
public class Vote {
    @Id
    private int id;
    Customer customer;
    Shiper shiper;
    Order order;
    private int rate;
    private String message;
}
