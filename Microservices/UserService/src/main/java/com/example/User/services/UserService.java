package com.example.User.services;

import com.example.User.entities.User;

import java.util.List;

public interface  UserService {

    User add(User user);

    List<User> getAllUsers();

    User getUser(int id);




}