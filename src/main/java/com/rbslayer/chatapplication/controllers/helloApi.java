package com.rbslayer.chatapplication.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class helloApi {
    @GetMapping("/hello")
    public String hello() {
        return "Hello world -- every thing is working";
    }
}
