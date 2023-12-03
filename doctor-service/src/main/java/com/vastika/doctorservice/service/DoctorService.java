package com.vastika.doctorservice.service;

import com.vastika.doctorservice.model.Doctor;
import com.vastika.doctorservice.model.DoctorDTO;

import java.util.List;

public interface DoctorService {

    Doctor saveDoctor(DoctorDTO doctorDTO);

    List <Doctor> listAllDoctor();

    void deleteDoctor(Long id);

     Doctor getDoctorBYID(Long doctorId);

    Doctor updateDoctor(Long doctorId, DoctorDTO doctorDTO);

    List<Doctor> getDoctorBySpeciality(String speciality);

}