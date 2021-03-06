package com.victorze.atm.usecases;

import com.victorze.atm.usecases.interfaces.boundaries.UserDetailBoundary;
import com.victorze.atm.entities.User;
import com.victorze.atm.usecases.interfaces.repositories.UserRepository;

public class UserDetail implements UserDetailBoundary {

    private UserRepository userRepository;

    public UserDetail(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User find(String userName) {
       return userRepository.get(userName);
    }

}
