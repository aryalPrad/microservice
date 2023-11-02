package com.vastika.doctorservice.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;

@NoArgsConstructor
@AllArgsConstructor
@Setter
public class Hotel {
   @Getter
   private String name;

   @Getter
   @JsonProperty(value = "number_of_guests")
   private int numberOfGuests;

    @Getter
    private Address address;

   @Getter
    private ArrayList<Guest> guests;

    @Getter
    @JsonProperty(value="is_open")
    private boolean isOpen;

    @Getter
    @JsonProperty(value = "opening_hour")
    private OpeningHours openingHours;
}
