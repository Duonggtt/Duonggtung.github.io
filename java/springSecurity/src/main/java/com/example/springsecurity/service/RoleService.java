package com.example.springsecurity.service;

import com.example.springsecurity.Reponsitory.IRoleRepository;
import com.example.springsecurity.model.entity.Role;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class RoleService implements IRoleService{
    @Autowired
    private IRoleRepository roleRepository;


    @Override
    public List<Role> findAll() {
        return roleRepository.findAll();
    }

    @Override
    public Optional<Role> findById(Long id) {
        return Optional.empty();
    }

    @Override
    public Role save(Role role) {
        return null;
    }

    @Override
    public void remove(Long id) {
        roleRepository.deleteById(id);
    }


    @Override
    public Role findByName(String name) {
        return null;
    }
}
