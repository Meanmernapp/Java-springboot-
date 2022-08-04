package com.ammar.ibltest.controller;

import com.ammar.ibltest.entity.User;
import com.ammar.ibltest.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.jws.soap.SOAPBinding;
import java.util.List;
@RestController
@RequestMapping("user")
public class UserController {
    @Autowired
    private UserService userService;
    @GetMapping
    public List<User> getAllUser(){
        return userService.fetchAllUser();
    }
    @GetMapping("/{id}")
    public User getUser(@PathVariable("id") Integer id){
        return userService.fetchUser(id);
    }
    @PostMapping("/create")
    public User createUser(@RequestBody User user){
        System.out.println("User ");
        System.out.println(user.getEmail());
        return userService.createUser(user);
    }
    @PutMapping("/update/{id}")
    public void updateUser(@RequestBody User user, @PathVariable("id") Integer id){
        userService.updateUser(user, id);
    }
}
