package com.vastika.doctorservice.controller;
import com.vastika.doctorservice.model.Address;
import com.vastika.doctorservice.model.Guest;
import com.vastika.doctorservice.model.Hotel;
import com.vastika.doctorservice.model.OpeningHours;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
@Slf4j
@RequestMapping(value= "/api/v1")
@Tag(name = "Hotel API V1", description = "This is V1 API")
public class HotelController {
    /*

    {
  "name": "ABC Hotel",
  "number_of_guests": 3,
  "address":{
    "country":"Nepal",
    "state": "Bagmati",
    "district":"Kathmandu"
  },
  "guests" :[
      {
        "firstName":"John",
        "lastName": "Doe"
      },
      {
        "firstName":"Ram",
        "lastName": "Thapa"
      },
      {
        "firstName":"Shyam",
        "lastName": "Sharma"
      }
  ],
  "is_open":true,

  "opening_hour": {
  "sunday" : "Off",
  "Monday" : "Off",
  "Tuesday" : "Off",
  "Wednesday" : "Off",
  "Thursday" : "Off",
  "Friday" : "Off",
  "Saturday" : "Off"
}

     */


    @GetMapping(value = "/hotel")
    public Hotel getHotel(){
        Address address = new Address("Nepal","Bagmati","Kathmandu");

        ArrayList<Guest> guests = new ArrayList<>();
        guests.add(new Guest("John", "Doe"));
        guests.add(new Guest("Ram", "Thapa"));
        guests.add(new Guest("Shyam", "Sharma"));

        OpeningHours openingHours = new OpeningHours();


        Hotel hotel = new Hotel();
        hotel.setName("ABC Hotel");
        hotel.setNumberOfGuests(guests.size());
        hotel.setAddress(address);
        hotel.setGuests(guests);
        hotel.setOpen(true);
        hotel.setOpeningHours(openingHours);

        return hotel;
    }
}
