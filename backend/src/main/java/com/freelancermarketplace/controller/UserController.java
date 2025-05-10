package com.freelancermarketplace.controller;

import org.springframework.web.bind.annotation.*;
import java.util.*;

@RestController
@RequestMapping("/api/users")
public class UserController {
    @GetMapping
    public List<String> getUsers() {
        return List.of("Alice", "Bob");
    }
}