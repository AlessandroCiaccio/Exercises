package com.example.restservicecors;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/v1")
public class NameController {
    @GetMapping(path = "/name")
    public String getName(@RequestParam(required = false, defaultValue = "Nobody") String name) {
        return name;
    }


    @PostMapping(path = "/reversed")
    public String getReversedName(@RequestParam(required = false, defaultValue = "Nobody") String name) {
        StringBuilder reversed = new StringBuilder(name);
        return reversed.reverse().toString();
    }
}
