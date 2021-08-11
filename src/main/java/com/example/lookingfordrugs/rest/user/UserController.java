package com.example.lookingfordrugs.rest.user;

import com.example.lookingfordrugs.persistence.user.UserRepository;
import com.example.lookingfordrugs.rest.user.model.UserRequestModel;
import com.example.lookingfordrugs.persistence.user.model.User;
import com.example.lookingfordrugs.service.user.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
@Autowired
    UserService userService;

    @PostMapping("/create/user")
    public String addUser(@RequestBody UserRequestModel userRequest) {
userService.create(userRequest);
        return "ok user";
    }
}
