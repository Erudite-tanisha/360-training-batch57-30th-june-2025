package org.training.Session3_RESTApi.services.Impl;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.training.Session3_RESTApi.entities.User;
import org.training.Session3_RESTApi.repo.UserRepository;
import org.training.Session3_RESTApi.services.UserService;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {


//    private List<User> list = new ArrayList<>();

    @Autowired
    private UserRepository userRepository;


    @Override
    public User addUser(User user) {
        return userRepository.save(user);
    }

    @Override
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }



    @Override
    public User deleteUserById(int id) {
        User foundUser = userRepository.findById(id).orElse(null);
        userRepository.deleteById(id);
        return foundUser;
    }

    @Override
    public User findUserByEmail(String email){
        return userRepository.findByEmail(email);
    }

    @Override
    public List<User> findByUserStartingWithV(Character character) {
        return userRepository.findByUserStartingWithV(character);
    }


}
