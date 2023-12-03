package com.vastika.doctorservice.exceptions;

public class DoctorNotFoundException extends RuntimeException {

    public DoctorNotFoundException(String message){
        super(message);// it calls the constructor of the parent class
    }
}
