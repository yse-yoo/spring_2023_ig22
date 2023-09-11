package com.example.demo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller("ArticleController")
public class ArticleController {
    
    @GetMapping(value="/article/{id}")
    public String detail(@PathVariable("id") Long id) {
        System.out.println("ID is " + id);
        return "article/detail";
    }
    
}
