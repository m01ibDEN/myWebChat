package com.m01ibDEN.myWebChat.service;

import com.m01ibDEN.myWebChat.models.User;
import com.m01ibDEN.myWebChat.repos.UserRepo;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    private final UserRepo userRepo;

    public UserService(UserRepo userRepo) {
        this.userRepo = userRepo;
    }

    public void save(User user) {
        userRepo.save(user);
    }

    public List<User> getUsers() {
        return userRepo.findAll();
    }
}
