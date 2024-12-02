package com.ucgorai.controller;

import com.ucgorai.model.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @GetMapping("/getuser")
    public User getUserDetails() {
        return new User().builder()
                .Id(2)
                .name("Uma")
                .age(36)
                .build();
    }

}
