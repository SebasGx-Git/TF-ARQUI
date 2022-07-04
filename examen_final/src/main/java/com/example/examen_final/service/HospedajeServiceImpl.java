package com.example.examen_final.service;

import com.example.examen_final.domain.model.Hospedaje;
import com.example.examen_final.domain.repository.HospedajeRepository;
import com.example.examen_final.domain.service.HospedajeService;
import com.example.examen_final.resource.SaveHospedajeResource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HospedajeServiceImpl implements HospedajeService {

    @Autowired
    private HospedajeRepository hospedajeRepository;

    @Override
    public List<Hospedaje> getAllHospedajes() {
        return hospedajeRepository.findAll();
    }

    @Override
    public List<Hospedaje> getAllHospedajesByHotelName(String hotelName) {
        return hospedajeRepository.findByHotelname(hotelName);
    }

    @Override
    public Hospedaje createHospedaje(SaveHospedajeResource resource) {
        Hospedaje newHospedaje = new Hospedaje(
                resource.getRequestId(),
                resource.getHotelname(),
                resource.getExDate(),
                resource.getInDate(),
                resource.getTotalCost()
        );
        return hospedajeRepository.save(newHospedaje);
    }
}
