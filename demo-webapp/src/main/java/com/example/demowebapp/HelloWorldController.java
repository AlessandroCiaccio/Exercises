package com.example.demowebapp;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/v1")
public class HelloWorldController {
    @RequestMapping(method = RequestMethod.GET, path = "/helloWorld")
    public String helloWorld() {
        return "Hello World 2!";
    }

    @GetMapping(path = "/hello")
    public String hello(@RequestParam(required = true) String name, @RequestParam(defaultValue = "Red") String surname) {
        return "Hello " + name + " " + surname + "!";
    }
}
