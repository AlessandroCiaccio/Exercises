package com.example.demoswagger.controllers;

import com.example.demoswagger.entities.Car;
import io.swagger.v3.oas.annotations.parameters.RequestBody;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("/v2")
public class CarController {
    ArrayList<Car> list = new ArrayList<>();
    @PutMapping(path="/car/add")
    public ArrayList<Car> addCarToList(@RequestBody Car newCar){
        list.add(newCar);
        return list;
    }
}
