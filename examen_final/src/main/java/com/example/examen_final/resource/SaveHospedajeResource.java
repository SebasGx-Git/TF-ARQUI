package com.example.examen_final.resource;

import java.util.Date;

public class SaveHospedajeResource {

    private Long requestId;
    private String hotelname;
    private Date InDate;
    private Date ExDate;
    private Float TotalCost;

    public Long getRequestId() {
        return requestId;
    }

    public SaveHospedajeResource setRequestId(Long requestId) {
        this.requestId = requestId;
        return this;
    }

    public String getHotelname() {
        return hotelname;
    }

    public SaveHospedajeResource setHotelname(String hotelname) {
        this.hotelname = hotelname;
        return this;
    }

    public Date getInDate() {
        return InDate;
    }

    public SaveHospedajeResource setInDate(Date inDate) {
        InDate = inDate;
        return this;

    }

    public Date getExDate() {
        return ExDate;
    }

    public SaveHospedajeResource setExDate(Date exDate) {
        ExDate = exDate;
        return this;
    }

    public Float getTotalCost() {
        return TotalCost;
    }

    public SaveHospedajeResource setTotalCost(Float totalCost) {
        TotalCost = totalCost;
        return this;

    }
}
