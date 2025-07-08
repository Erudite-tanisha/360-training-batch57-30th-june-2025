package org.training.Session5_Spring.Security.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.web.bind.annotation.*;
import org.training.Session5_Spring.Security.entities.User;
import org.training.Session5_Spring.Security.services.UserService;

import java.util.List;

@RestController
@RequestMapping("/users")
@EnableGlobalMethodSecurity(prePostEnabled = true)
public class UserController {

    @Autowired
    public UserService userService;

    @GetMapping
    public List<User> getAllUsers(){
        return this.userService.getAllUsers();
    }

    @PreAuthorize("hasRole('ADMIN')")
    @GetMapping("/{username}")
    public User getUser(@PathVariable String username){
        return this.userService.getUser(username);
    }

    @PostMapping
    public User addUser(@RequestBody User user){
        return this.userService.addUser(user);
    }

}
