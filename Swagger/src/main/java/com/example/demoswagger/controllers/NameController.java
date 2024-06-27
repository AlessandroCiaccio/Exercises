package com.example.demoswagger.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("/v1")
public class NameController {
    @GetMapping(path = "/name/{name}")
    public String getName(@PathVariable String name) {

        return name;
    }

    @PostMapping(path = "/reversed")
    public String getReversedName(@RequestParam String name) {
        StringBuilder reversed = new StringBuilder(name);
        return reversed.reverse().toString();
    }
}
