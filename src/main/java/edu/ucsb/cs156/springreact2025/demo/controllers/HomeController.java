package edu.ucsb.cs156.springreact2025.demo.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;

@RestController
@Slf4j
public class HomeController {

    @GetMapping("/")
    public String home() {
        log.info("HomeController.home() called");
        return "Welcome to the Home Page!";
    }

    @GetMapping("/secured")
    public String secured() {
        log.info("HomeController.home() called");
        return "Welcome to the Secured Page!";
    }
}
