package org.training.Session3_RESTApi.services;


import org.training.Session3_RESTApi.entities.User;

import java.util.List;

public interface UserService {

    User addUser(User user);

    List<User> getAllUsers();

    User deleteUserById(int id);

    User findUserByEmail(String email);

    List<User> findByUserStartingWithV(Character character);

}
