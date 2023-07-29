package com.userform.userform.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.userform.userform.dao.UserRepository;
import com.userform.userform.entities.UserModel;

@Component
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public UserModel addUser(UserModel user)
    {
        UserModel u=(UserModel) this.userRepository.save(user);
        return u;
    }
}
