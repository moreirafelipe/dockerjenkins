package com.example.dockerjenkins.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class JenkinsController {
    @GetMapping
    public static void main(String[] args) {
        System.out.println("Jenkins test");
    }
}
