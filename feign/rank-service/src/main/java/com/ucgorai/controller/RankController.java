package com.ucgorai.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RankController {

    @GetMapping("/getrank")
    public int getRank (@RequestParam int userId) {
        if (userId == 2) {
            return 1;
        } else {
            return 2;
        }

    }
}
