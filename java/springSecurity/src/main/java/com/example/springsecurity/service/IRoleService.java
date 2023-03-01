package com.example.springsecurity.service;


import com.example.springsecurity.model.entity.Role;

public interface IRoleService extends IGeneralService<Role>{
    Role findByName(String name);
}
