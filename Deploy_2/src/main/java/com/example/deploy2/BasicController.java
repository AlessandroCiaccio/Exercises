package com.example.deploy2;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Random;

@RestController
@RequestMapping("")
public class BasicController {
    Random random = new Random();

    @GetMapping("/sum")
    public String getName() {
        Integer num1 = random.nextInt(2000);
        Integer num2 = random.nextInt(2000);
        return "The sum of " + num1 + " and " + num2 + " is -> " + (num1 + num2);
    }
}
