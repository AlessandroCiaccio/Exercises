package com.example.env;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class BasicController {
    @Autowired
    private Environment environment;

    @GetMapping("/welcome")
    public String greetings() {
        return environment.getProperty("welcomeMsg");
    }
}
