package com.ammar.ibltest.service;

import com.ammar.ibltest.entity.User;

import java.util.List;

public interface UserService {
    User createUser(User user);
    List<User> fetchAllUser();
    User fetchUser(Integer userId);
    User updateUser(User user, Integer userId);
}
