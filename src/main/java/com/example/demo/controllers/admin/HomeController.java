package com.example.demo.controllers.admin;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;


@Controller("AdminHomeController")
// URLパターンで「/admin/」 は共通
@RequestMapping("/admin/")
public class HomeController {
    
    @GetMapping(value="")
    public String index() {
        // resouces/templates/admin/index.html
        return "admin/index";
    }
    
}
