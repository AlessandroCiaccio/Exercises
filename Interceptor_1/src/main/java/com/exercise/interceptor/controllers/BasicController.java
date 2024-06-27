package com.exercise.interceptor.controllers;

import com.fasterxml.jackson.datatype.jsr310.ser.LocalDateSerializer;
import com.fasterxml.jackson.datatype.jsr310.ser.OffsetDateTimeSerializer;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Date;

@RestController
@RequestMapping("")
public class BasicController {
    @GetMapping("/time")
    public OffsetDateTime getCurrentDataTime() {
        return OffsetDateTime.now();
    }
}
