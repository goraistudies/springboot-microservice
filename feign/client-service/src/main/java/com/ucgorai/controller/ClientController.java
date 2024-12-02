package com.ucgorai.controller;

import com.ucgorai.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ClientController {

    @Autowired
    private UserService userService;
    @Autowired
    private Environment environment;

    @GetMapping("/get-rank-by-user-id")
    public String getUserRankById () {

        return userService.getUser().getName();
    }
}
