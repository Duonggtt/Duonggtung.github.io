package com.example.springsecurity.Reponsitory;

import com.example.springsecurity.model.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {
}
