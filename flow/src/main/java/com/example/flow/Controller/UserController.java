package com.example.flow.Controller;

import com.example.flow.Model.UserModel;
import com.example.flow.Service.UserService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/")
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/")
    public ResponseEntity<List<UserModel>> getUserList() {
        return (ResponseEntity<List<UserModel>>) userService.getUserList();
    }
}
