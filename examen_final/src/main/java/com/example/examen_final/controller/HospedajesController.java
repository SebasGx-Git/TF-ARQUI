package com.example.examen_final.controller;

import com.example.examen_final.domain.model.Hospedaje;
import com.example.examen_final.domain.service.HospedajeService;
import com.example.examen_final.resource.SaveHospedajeResource;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/api")
@CrossOrigin
public class HospedajesController {

    @Autowired
    private HospedajeService hospedajeService;

    @Operation(summary = "Get All Hospedajes", description = "Get All Hospedajes by Pages", tags = {"Hospedajes"})
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "All Hospedajes returned", content = @Content(mediaType =
                    "application/json"))
    })
    @GetMapping("/hospedajes")
    public ResponseEntity<List<Hospedaje>> getAllHospedajes(){
        try{
            return new ResponseEntity<>(hospedajeService.getAllHospedajes(), HttpStatus.OK);
        }catch (Exception e){
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @Operation(summary = "Get All Hospedajes By Name", description = "Get All Hospedajes by Name and Pages", tags = {"Hospedajes"})
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "All Hospedajes by name returned", content = @Content(mediaType =
                    "application/json"))
    })
    @GetMapping("/hospedajes/nombre/{hotelName}")
    public ResponseEntity<List<Hospedaje>> getHospedajesByHotelName(@PathVariable(name = "hotelName") String hotelName){
        try {
            return new ResponseEntity<>(hospedajeService.getAllHospedajesByHotelName(hotelName), HttpStatus.OK);
        } catch (Exception e){
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @Operation(summary = "Post Hospedaje", description = "Create an Hospedaje", tags = {"Hospedajes"})
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Hospedaje registered", content = @Content(mediaType =
                    "application/json"))
    })
    @PostMapping("/hospedajes")
    public ResponseEntity<?> createHospedaje(@Valid @RequestBody SaveHospedajeResource resource){
        try {
            return new ResponseEntity<>(hospedajeService.createHospedaje(resource), HttpStatus.OK);
        }catch (Exception e){
            return new ResponseEntity<>(e, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

}
