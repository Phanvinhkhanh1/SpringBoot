package com.example.flow.Model;

import com.example.flow.Entity.User;

public class UserModel {
    private String name;
    private Integer age;

    public UserModel(User entity) {
        this.name = entity.name;
        this.age = entity.age;
    }
}
