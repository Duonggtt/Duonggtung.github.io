package com.example.deliverymanagement.modle.entity;

import jakarta.persistence.*;
import lombok.Data;

@Table(name = "product")
@Entity
@Data
public class Product {
    @Id
    private int id;
    private String name;
    private int weight;
    private int quantity;
}
