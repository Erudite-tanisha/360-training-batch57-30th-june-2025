package org.training.Session3_RESTApi.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.training.Session3_RESTApi.entities.User;
import org.training.Session3_RESTApi.services.UserService;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {


    public UserService userService;

    public UserController(@Autowired UserService userService) {
        this.userService = userService;
    }

    @PostMapping("/add")
    public User addUser(@RequestBody User user){
        return userService.addUser(user);
    }

    @GetMapping
    public List<User> getAllUsers(){
        return userService.getAllUsers();
    }

//    @GetMapping("/{email}")
//    public User getUserByEmail(@PathVariable String email){
//        return userService.findUserByEmail(email);
//    }

    @GetMapping("/{character}")
    public List<User> getUserByV(@PathVariable Character character){
        return userService.findByUserStartingWithV(character);
    }


    @DeleteMapping("{userId}")
    public User deleteUserById(@PathVariable("userId") int id){
        return userService.deleteUserById(id);
    }
}
