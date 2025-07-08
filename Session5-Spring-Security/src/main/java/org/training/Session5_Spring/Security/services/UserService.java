package org.training.Session5_Spring.Security.services;


import org.springframework.stereotype.Service;
import org.training.Session5_Spring.Security.entities.User;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserService {

    List<User> list = new ArrayList<>();

    public UserService() {
        list.add(new User("tanisha", "abc", "tan@gmail.com"));
        list.add(new User("sai", "def", "sai@gmail.com"));
        list.add(new User("vasudev", "xyz", "vas@gmail.com"));


    }

    public List<User> getAllUsers(){
        return this.list;
    }

    public User getUser(String username){
        return this.getAllUsers().stream().filter(user -> user.getUsername().equals(username)).findAny().orElse(null);
    }


    public User addUser(User user){
        this.list.add(user);
        return user;
    }


}
