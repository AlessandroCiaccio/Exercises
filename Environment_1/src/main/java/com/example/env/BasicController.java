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

    @GetMapping("/greetings")
    public String greetings() {
        String name = environment.getProperty("myCustomVarTree.devName");
        String authCode = environment.getProperty("myCustomVarTree.authCode");
        return "Hi and welcome " + name + " " + authCode;
    }
}
