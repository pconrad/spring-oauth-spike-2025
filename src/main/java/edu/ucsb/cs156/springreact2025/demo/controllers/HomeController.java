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
        return "<h1>Home Page</h1>" + links();
    }

    @GetMapping("/secured")
    public String secured() {
        log.info("HomeController.home() called");
        return "<h1>Welcome to the Secured Page!</h1>" + links();
    }

    public String links() {
        return """
                <ul>
                <li><a href='/'>Home</a></li>
                <li><a href='/secured'>Secured</a></li>
                <li><a href='/login'>Login</a></li>
                <li><a href='/logout'>Logout</a></li>
                </ul>
                """;
    }
}
