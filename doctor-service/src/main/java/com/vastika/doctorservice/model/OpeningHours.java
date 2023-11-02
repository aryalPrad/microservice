package com.vastika.doctorservice.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
@Getter
public class OpeningHours {

    @JsonProperty(value = "Sunday")
    private String sunday;
    @JsonProperty(value = "Monday")
    private String monday;
    @JsonProperty(value = "Tuesday")
    private String tuesday;
    @JsonProperty(value = "Wednesday")
    private String wednesday;
    @JsonProperty(value = "Thursday")
    private String thursday;
    @JsonProperty(value = "Friday")
    private String friday;
    @JsonProperty(value = "Saturday")
    private String saturday;

   public OpeningHours(){

         sunday = "Off";
        monday = "09:00AM - 07:00PM";
        tuesday = "09:00AM - 07:00PM";
         wednesday = "09:00AM - 07:00PM";
         thursday = "09:00AM - 07:00PM";
         friday = "09:00AM - 07:00PM";
         saturday = "09:00AM - 07:00PM";

    }

}
