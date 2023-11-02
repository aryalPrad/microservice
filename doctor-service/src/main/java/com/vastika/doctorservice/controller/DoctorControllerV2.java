package com.vastika.doctorservice.controller;

import com.vastika.doctorservice.model.Doctor;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api/v2")
@Tag(name = "Doctor API V2", description = "This is V2 API")
public class DoctorControllerV2 {
    @Operation(
            summary = "Create Doctor",
            description = "This is used to create  doctor ."
    )
    @PostMapping(value = "/doctor")
    public String createDoctor(){
        return "Doctor created successfully";
    }
}
