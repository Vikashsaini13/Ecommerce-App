package com.example.EcommerceApp.controller;

import com.example.EcommerceApp.model.User;
import com.example.EcommerceApp.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.support.SimpleTriggerContext;
import org.springframework.web.bind.annotation.*;

@RestController
public class UserController {

    @Autowired
    UserService userService;

    //create user
    @PostMapping("user")
    public String createUser(@RequestBody User user){
        return userService.createUser(user);
    }

    //get user by user id
    @GetMapping("user/id/{id}")
    public User getUserById(@PathVariable Integer id){
        return userService.getUserById(id);
    }
}
