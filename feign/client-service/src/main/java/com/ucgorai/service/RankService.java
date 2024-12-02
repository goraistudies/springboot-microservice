package com.ucgorai.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient("RANK-SERVICE")
public interface RankService {
    @GetMapping("/getrank")
    int getRank();
}
