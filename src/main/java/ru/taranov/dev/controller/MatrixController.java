package ru.taranov.dev.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MatrixController {

    @GetMapping("/")
    public String home() {
        return "startPage";
    }

    @GetMapping("/login")
    public String login() {
        return "login";
    }

    @GetMapping("/admin")
    public String admin() {
        return "admin";
    }

    @GetMapping("/chat")
    public String chatPage() {
        return "chat";
    }
}

