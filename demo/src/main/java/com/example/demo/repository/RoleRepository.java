package com.example.demo.repository;

import com.example.demo.model.Roles;
import org.apache.catalina.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Set;

public interface RoleRepository extends JpaRepository<Roles, Long>{
    Roles findByUsers(Set<User> users);
}