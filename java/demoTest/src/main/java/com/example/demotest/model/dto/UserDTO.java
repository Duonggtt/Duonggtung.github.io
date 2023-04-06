package com.example.demotest.model.dto;

import com.example.demotest.model.Wallet;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import lombok.Data;

@Data
public class UserDTO {

    private String name;
    private boolean gender;
    private Wallet wallet;
}
