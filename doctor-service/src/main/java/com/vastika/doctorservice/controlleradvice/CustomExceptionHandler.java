package com.vastika.doctorservice.controlleradvice;

import com.vastika.doctorservice.exceptions.DoctorNotFoundException;
import com.vastika.doctorservice.model.ErrorResponse;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.time.LocalDateTime;

@ControllerAdvice  //Exception handle garne annotation to let spring boot know this class is handling exception

public class CustomExceptionHandler {

    @ExceptionHandler(DoctorNotFoundException.class) //This annotation denotes this function is used to handle the exception
    public ResponseEntity<String> handleDoctorNotFoundException(DoctorNotFoundException ex){
        ErrorResponse response = ErrorResponse.builder()
                .message(ex.getLocalizedMessage())//yo chai builder pattern ma object banako
                .status("ERROR")//yo chai builder pattern ma object banako
                .localDateTime(LocalDateTime.now())
                .build();

        return new ResponseEntity<>(ex.getLocalizedMessage(), HttpStatus.NOT_FOUND);
    }

    @ExceptionHandler(EmptyResultDataAccessException.class) //This annotation denotes this function is used to handle the exception
    public ResponseEntity<String> handleDataDeleteException(EmptyResultDataAccessException ex){
        return new ResponseEntity<>("The data you are trying to delete doesn't exist", HttpStatus.NOT_FOUND);
    }


    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ResponseEntity<ErrorResponse> handleDataValidationException(MethodArgumentNotValidException ex){
        ErrorResponse response = ErrorResponse.builder()
                .message("Validation error")
                .status("ERROR")
                .localDateTime(LocalDateTime.now())
                .build();
        return new ResponseEntity<>(response, HttpStatus.BAD_REQUEST);
    }

}
