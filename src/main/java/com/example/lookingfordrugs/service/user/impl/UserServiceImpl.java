package com.example.lookingfordrugs.service.user.impl;

import com.example.lookingfordrugs.persistence.user.UserRepository;
import com.example.lookingfordrugs.persistence.user.model.User;
import com.example.lookingfordrugs.rest.user.model.UserRequestModel;
import com.example.lookingfordrugs.service.user.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserRepository userRepository;
    @Override
    public void create(UserRequestModel userRequest) {
              User user = new User();
        user.setName(userRequest.getName());
        user.setSurname(userRequest.getSurname());
        user.setLogin(userRequest.getLogin());
        user.setPassword(userRequest.getPassword());
        user.setEmail(userRequest.getEmail());
        userRepository.save(user);
    }
}
