package com.vastika.doctorservice.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.extern.slf4j.Slf4j;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Positive;

@Getter
@NoArgsConstructor
@Slf4j
@ToString

public class DoctorDTO {

    @Setter
    @NotNull(message = "NMC number cannot be null")//validation bhanne dependency bata ayeko
    @JsonProperty("nmc_number")
    private String nmcNumber;
    @Setter
    @NotNull(message = "Name cannot be null")
    private String name;
    @Setter
    @NotNull(message = "Phone Number cannot be null")
    private String phoneNumber;
    @Setter
    @NotNull
    @Email(message = "Email is not valid ")//validation
    private String email;
    @Setter
    @NotNull(message = "Speciality should not be null")
    private String speciality;
    @Setter
    @Positive(message = "Fee should be positive")//Validation
    private double fee;

    public Doctor mapToDoctor(){
        Doctor doctor = new Doctor();
        doctor.setNmcNumber(this.getNmcNumber());
        doctor.setName(this.getName());
        doctor.setPhoneNumber(this.getPhoneNumber());
        doctor.setSpeciality(this.getSpeciality());
        doctor.setFee(this.getFee());
        doctor.setEmail(this.getEmail());
        return doctor;
    }

}
