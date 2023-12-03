package com.vastika.appointmentservice.controller;

import com.vastika.appointmentservice.feignclients.DoctorServiceClient;
import com.vastika.appointmentservice.model.Doctor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api/v1")
@Slf4j
public class AppointmentController {


    @Autowired
    public DoctorServiceClient doctorServiceClient;
    @GetMapping(value = "/ping")
    public String ping(){
        Doctor doctor = doctorServiceClient.getDoctorDetail(13L);
        log.info(doctor.toString());
        return "UP appointment-service-2";
    }

//@GetMapping(value = "/book-appointment")//khas ma postmapping huna parca aaile herna lai matra getmapping banako
//public String bookAppointment(){
//    try {
//        appointmentService.bookAppointment();
//    } catch (IOException e) {
//        return "Booking unsuccessful";
//    }
//    return "Booking Successful";
//}

}