package com.example.flow.Service;

import com.example.flow.Entity.User;
import com.example.flow.Model.UserModel;
import com.example.flow.Repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class UserService {

    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public List<UserModel> getUserList() {
        List<User> users = userRepository.findAll();

        List<UserModel> userModels = users.stream()
                .map(UserModel::new)
                .collect(Collectors.toList());

        return userModels;
    }
}
