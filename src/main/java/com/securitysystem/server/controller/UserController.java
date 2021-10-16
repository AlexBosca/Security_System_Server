package com.securitysystem.server.controller;

import com.securitysystem.server.model.User;
import com.securitysystem.server.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    private final UserService service;

    @Autowired
    public UserController(UserService service) {
        this.service = service;
    }

    @PostMapping("/register")
    public String registerUser(@RequestBody User user) {
        service.saveUser(user);

        return "You have successfully registered!";
    }

    @GetMapping("/getAll")
    public List<User> getAllUsers() {
        return service.getAllUsers();
    }

    @GetMapping("/getByEmail")
    public User getUser(@RequestBody String email) {
        return service.getUserByEmail(email);
    }

}
