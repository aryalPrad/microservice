package com.vastika.doctorservice.model;

import lombok.Builder;
import lombok.Getter;

import java.time.LocalDateTime;

//yo class chai error response haru yeutai format ko hos bhaner banako
@Builder//lombok  le dinxa builder bhanne
//@builder use gareko cha bhane constructor banauna paudaina
@Getter
public class ErrorResponse {

    private String status;
    private String message;
    private LocalDateTime localDateTime;
}
