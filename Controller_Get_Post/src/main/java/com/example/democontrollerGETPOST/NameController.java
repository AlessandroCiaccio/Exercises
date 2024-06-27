package com.example.democontrollerGETPOST;

import org.springframework.web.bind.annotation.*;

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
