package com.example.restapi.service;

import com.example.restapi.entity.User;
import com.example.restapi.repository.UserRepository;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public User saveUser(User user) {
        return userRepository.save(user);
    }

    public User findById(int id) {
        Optional<User> user = userRepository.findById(id);

        if (user.isEmpty()) {
            throw new RuntimeException("User not found");
        }

        return user.get();
    }

    public List<User> findAll() {
        return userRepository.findAll();
    }

    public User updateUser(User user) {
        Optional<User> dbuser = userRepository.findById(user.getId());

        if (dbuser.isEmpty()) {
            throw new RuntimeException("User not found");
        }

        User exisitingUser = dbuser.get();
        exisitingUser.setUsername(user.getUsername());

        return userRepository.save(exisitingUser);
    }

    public void deleteUser(int id) {
        Optional<User> dbuser = userRepository.findById(id);

        if (dbuser.isEmpty()) {
            throw new RuntimeException("User not found");
        }

        userRepository.delete(dbuser.get());
    }
}
