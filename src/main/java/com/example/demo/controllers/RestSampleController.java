package com.example.demo.controllers;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@RestController
public class RestSampleController {

    // http://localhost:8080/hello
    @GetMapping(value = "/hello")
    public String index() {
        return "Hello, Spring";
    }

    // http://localhost:8080/bye?name=xxxxx
    @GetMapping(value = "/bye")
    // public String bye(@RequestParam String name) {
    public String bye(@RequestParam(name = "name", required = false) String param) {
        String message = "Bye!" + param;
        return message;
    }

}
