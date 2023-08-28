package com.example.demo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    //reosuces/templates/home/sample.html を表示
    @GetMapping("/")
    public String index() {
        return "home/sample";
    }

}
