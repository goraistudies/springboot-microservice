package com.ucgorai.service;

import com.ucgorai.model.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient("USER-SERVICE")
public interface UserService {
    @GetMapping("/getuser")
    User getUser();
}
