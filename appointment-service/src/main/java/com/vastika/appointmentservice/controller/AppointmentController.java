package com.vastika.appointmentservice.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
@RequestMapping(value = "/api/v1")
@Slf4j

public class AppointmentController {

    @GetMapping(value = "/ping")
    public String ping(){
        return "UP";
    }
}
