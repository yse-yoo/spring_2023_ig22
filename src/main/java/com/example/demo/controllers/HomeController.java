package com.example.demo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    //Webルートにルーティング
    @GetMapping("/")
    public String index() {
        //reosuces/templates/home/sample.html を表示
        return "home/sample";
    }

}
