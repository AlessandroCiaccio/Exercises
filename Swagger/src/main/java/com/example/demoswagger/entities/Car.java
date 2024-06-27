package com.example.demoswagger.entities;

import lombok.*;

import java.util.UUID;


@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Car {

    private String marca;
    private String modello;
    private Integer cilindrata;

    private UUID id;
}
