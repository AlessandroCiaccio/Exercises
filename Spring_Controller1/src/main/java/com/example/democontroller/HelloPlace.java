package com.example.democontroller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/v2")
public class HelloPlace {
    @GetMapping(path = "/ciao/{provincia}")
    public User helloNameFromPlace(
            @RequestParam String nome,
            @PathVariable String provincia,
            @RequestParam(required = false, defaultValue = " ") String saluto) {
        return new User(nome, provincia, saluto);
  //      return "Ciao " + nome + ", com'è il tempo in " + provincia + "?";

    }
}

