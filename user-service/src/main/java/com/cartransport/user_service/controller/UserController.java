package com.cartransport.user_service.controller;

import com.cartransport.user_service.repository.UserRepository;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/users")
public class UserController {

    private final UserRepository repository;
    private final RestTemplate restTemplate;

    public UserController(UserRepository repository, RestTemplate restTemplate) {
        this.repository = repository;
        this.restTemplate = restTemplate;
    }

    @GetMapping("/cars")
    public String getCarsFromCarService() {
        return restTemplate.getForObject(
                "http://car-service/cars",
                String.class
        );
    }
}
