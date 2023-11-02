package com.vastika.doctorservice.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.extern.slf4j.Slf4j;

@Getter
@NoArgsConstructor
@Slf4j
@ToString

public class DoctorDTO {

    @Setter
    @JsonProperty("nmc_number")
    private long nmcNumber;
    @Setter
    private String name;
    @Setter
    private String phoneNumber;
    @Setter
    private String email;
    @Setter
    private String speciality;
    @Setter
    private double fee;

}
