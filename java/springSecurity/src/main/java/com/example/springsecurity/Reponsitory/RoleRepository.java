package com.example.springsecurity.Reponsitory;

import com.example.springsecurity.model.entity.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<Role, Integer> {
}
