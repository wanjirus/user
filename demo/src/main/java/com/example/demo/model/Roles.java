package com.example.demo.model;

import org.apache.catalina.User;
import org.springframework.data.annotation.Id;

import javax.persistence.*;
import java.util.Set;

@Entity

@Table(name = "Role")
public class Roles{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @ManyToMany(mappedBy = "roles")
    private Set<User> users;
    private String profile;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<User> getUsers() {
        return users;
    }

    public void setUsers(Set<User> users) {
        this.users = users;
    }

    public String getProfile(){return profile;}

    public void setProfile(String profile) {this.profile=profile;}
    }
