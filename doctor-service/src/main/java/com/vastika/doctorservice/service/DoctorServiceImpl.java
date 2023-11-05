package com.vastika.doctorservice.service;

import com.vastika.doctorservice.model.Doctor;
import com.vastika.doctorservice.model.DoctorDTO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;
@Slf4j
@Service
public class DoctorServiceImpl implements DoctorService {


    @Override
    public Doctor saveDoctor(DoctorDTO doctorDTO) {
        return null;
    }

    @Override
    public List<Doctor> listAllDoctors() {
        return null;
    }

    @Override


    public void deleteDoctor(Long id) {

    }

    @Override
    public Doctor getDoctorById(Long doctorId) {
        return null;
    }

    @Override
    public Doctor updateDoctor(Long doctorId, DoctorDTO doctorDTO) {
        return null;
    }

    @Override
    public List<Doctor> getDoctorBySpeciality(String speciality) {
        return null;
    }
}
