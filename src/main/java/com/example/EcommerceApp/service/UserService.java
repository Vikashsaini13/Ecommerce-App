package com.example.EcommerceApp.service;

import com.example.EcommerceApp.model.User;
import com.example.EcommerceApp.repository.IUserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserService {

    @Autowired
    IUserRepo iUserRepo;

    public String createUser(User user) {
        iUserRepo.save(user);
        return "Added";
    }

    public User getUserById(Integer id) {
        Optional<User> user= iUserRepo.findById(id);
        return user.get();
    }
}
