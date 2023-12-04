package com.vastika.appointmentservice.service;

import com.vastika.appointmentservice.feignclients.DoctorServiceClient;
import com.vastika.appointmentservice.model.Doctor;
import feign.FeignException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.IOException;

@Service
@Slf4j
public class AppointmentServiceImpl implements  AppointmentService{


    @Autowired
    public DoctorServiceClient doctorServiceClient;

    @Override
    public Boolean bookAppointment() throws IOException {
        try {
            Doctor doctor = doctorServiceClient.getDoctorDetail(13L); //13 id bhako doctor ko detail mageko
            log.info(doctor.toString());
        }catch (FeignException exception){
            log.error(exception.getLocalizedMessage());
            throw new IOException(exception.getMessage());
        }

        return null;
    }
}
