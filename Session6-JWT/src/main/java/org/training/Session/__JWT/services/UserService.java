package org.training.Session.__JWT.services;


import org.springframework.stereotype.Service;
import org.training.Session.__JWT.entities.User;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Service
public class UserService {

    private final List<User> list = new ArrayList<>();

    public UserService() {
       list.add(new User(UUID.randomUUID().toString(), "tanisha", "tan@gmail.com"));
        list.add(new User(UUID.randomUUID().toString(), "tanisha1", "abc1@gmail.com"));

    }

    public List<User> getUsers(){
        return this.list;
    }

}
