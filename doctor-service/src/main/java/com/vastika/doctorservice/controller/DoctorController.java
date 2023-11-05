package com.vastika.doctorservice.controller;

import com.vastika.doctorservice.model.DoctorDTO;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.ToString;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

@RestController
@Slf4j
@ToString
//@RequestMapping(value = "/doctor-service/api/v1")
//yeta /api/v1 rakhera baki kura application properties ma rakhda pani huncha

@RequestMapping(value= "/api/v1")
@Tag(name = "Doctor API V1", description = "This is V1 API")
public class DoctorController {

    /*
        HTTP Methods
        1. GET
        2. POST
        3. PUT
        4. PATCH
        5. DELETE
     */

    /*
    HTTP CODE
     2XX ->
     200 - success or ok

     3XX


     4XX --> Client side error
        404 - NOT FOUND
        405 - METHOD NOT ALLOWED


       5XX  -> Server side error

     */
//    @Autowired
//    private DoctorService doctorService;


    public DoctorController(){
        log.info("Doctor controller object is created");
    }


    @GetMapping
    public String index(){
        return "Doctor Index";
    }

    @GetMapping(value = "/ping")
    public String ping(){
        return "Doctor service is UP";
    }

    @Operation(
            summary = "Create Doctor",
            description = "This is used to create  doctor ."
            )
    @PostMapping(value = "/doctor")
    public String createDoctor(@RequestBody DoctorDTO doctorDTO){
        log.info(doctorDTO.toString());
//        doctorService.saveDoctor(doctorDTO);
        return "Doctor created successfully";
    }

    @GetMapping(value = "/doctor/{doctorId}")
    public String getDoctorDetail(@PathVariable("doctorId")Long id){
        log.info(String.valueOf(id));
        return "Doctor Detail ";
    }

    @GetMapping(value = "/doctor/speciality")
    public String getDoctorWithSpeciality(@RequestParam("sep") String special){

        return "Doctor List ";
    }

    @PutMapping(value = "/doctor/{doctorId}")
    public  String  update (@PathVariable("doctorId")Long doctorId,@RequestBody DoctorDTO doctorDTO ){
        log.info(String.valueOf(doctorId));
        log.info(doctorDTO.toString());
        return "Doctor updated successfully ";
    }

    @DeleteMapping(value = "/doctor/{doctorId}")
    public String delete (@PathVariable("doctorId")Long doctorId){
        log.info(String.valueOf(doctorId));
        return "Doctor Deleted successfully ";
    }


}
