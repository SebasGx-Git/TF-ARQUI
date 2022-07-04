package com.example.examen_final.domain.service;

import com.example.examen_final.domain.model.Hospedaje;
import com.example.examen_final.resource.SaveHospedajeResource;

import java.util.List;

public interface HospedajeService {

    List<Hospedaje> getAllHospedajes();

    List<Hospedaje> getAllHospedajesByHotelName(String hotelName);

    Hospedaje createHospedaje(SaveHospedajeResource resource);
}
