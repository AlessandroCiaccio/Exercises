package com.example.restservicecors;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/v1")

public class NameController {
    @CrossOrigin(origins = "http://localhost:9000")
    @GetMapping(path = "/name")
    public String getName(@RequestParam String name) {
        return name;
    }
    @CrossOrigin(origins = "http://localhost:9000")
    @PostMapping(path = "/reversed")
    public String getReversedName(@RequestParam String name) {
        StringBuilder reversed = new StringBuilder(name);
        return reversed.reverse().toString();
    }

}
