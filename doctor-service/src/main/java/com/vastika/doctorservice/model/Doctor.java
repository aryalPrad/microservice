package com.vastika.doctorservice.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.extern.slf4j.Slf4j;

import javax.persistence.*;

@Getter
@NoArgsConstructor
@Slf4j
@ToString

@Entity//class used for database table
@Table(name = "doctor_db")//for database
public class Doctor {

    @Id//yo chai primary key table ko bhanne bujaucha
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Setter
    @Column //database ko column banaune
    @JsonProperty("nmc_number")
    private String nmcNumber;

    @Setter
    @Column(length = 80)
    private String name;

    @Setter
    @Column(name = "phone_number", length = 14)
    private String phoneNumber;

    @Setter
    @Column(length=50)
    private String email;

    @Setter
    @Column(length = 80)
    private String speciality;

    @Setter
    @Column
    private double fee;

//    public Doctor(long nmcNumber, String name, String phoneNumber, String email, String speciality, double fee) {
//        this.nmcNumber = nmcNumber;
//        this.name = name;
//        this.phoneNumber = phoneNumber;
//        this.email = email;
//        this.speciality = speciality;
//        this.fee = fee;
//    }
}
