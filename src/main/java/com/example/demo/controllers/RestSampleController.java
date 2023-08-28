package com.example.demo.controllers;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
public class RestSampleController {
    
    @GetMapping(value="/hello")
    public String index() {
        return "Hello, Spring";
    }
    
}
