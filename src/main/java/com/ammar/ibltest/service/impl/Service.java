package com.ammar.ibltest.service.impl;

import com.ammar.ibltest.entity.User;
import com.ammar.ibltest.repository.UserRepo;
import com.ammar.ibltest.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@org.springframework.stereotype.Service
public class Service implements UserService {
    @Autowired
    private UserRepo userRepo;

    @Override
    public User createUser(User user) {

        return userRepo.save(user);
    }

    @Override
    public User fetchUser(Integer userId) {
        return userRepo.findById(userId).get();
    }
    @Override
    public List<User> fetchAllUser() {
        return userRepo.findAll();
    }

    @Override
    public User updateUser(User user, Integer userId) {
        User userdb = userRepo.findById(userId).get();
        userdb.setEmail(user.getEmail());
        userdb.setFirstName(user.getFirstName());
        userdb.setPassword(user.getPassword());
        userdb.setSecondName(user.getSecondName());

        return userRepo.save(userdb);
    }
}
