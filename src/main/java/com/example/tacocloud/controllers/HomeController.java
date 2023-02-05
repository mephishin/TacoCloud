package com.example.tacocloud.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

@Controller
@SessionAttributes("tacoOrder")
public class HomeController {

    @GetMapping("/")
    public String home() {
        return "home";
    }
}
