package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class UserController {

    @GetMapping("/")
    public String home() {
        return "home";
    }

    @GetMapping("/login")
    public String login() {
        return "login";
    }

    @GetMapping("/register")
    public String register() {
        return "register";
    }

    @GetMapping("/course_feedback")
    public String courseFeedback() {
        return "course_feedback"; // Return the course feedback HTML page
    }

    @GetMapping("/faculty_feedback")
    public String facultyFeedback() {
        return "faculty_feedback"; // Return the faculty feedback HTML page
    }

    @PostMapping("/login")
    public String loginUser(@RequestParam String username, @RequestParam String password) {
        // Add login logic here
        return "redirect:/";
    }

    @PostMapping("/register")
    public String registerUser(@RequestParam String username, @RequestParam String email, @RequestParam String password) {
        // Add registration logic here
        return "redirect:/login";
    }
}
