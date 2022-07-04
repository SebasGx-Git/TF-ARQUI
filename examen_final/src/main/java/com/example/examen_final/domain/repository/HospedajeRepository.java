package com.example.examen_final.domain.repository;

import com.example.examen_final.domain.model.Hospedaje;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface HospedajeRepository extends JpaRepository<Hospedaje, Long> {

   List<Hospedaje> findHospedajeById(Long Id);

   List<Hospedaje> findByHotelname(String hotelName);
}
