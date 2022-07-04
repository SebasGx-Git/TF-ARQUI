package com.example.examen_final.domain.model;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "hospedajes")
public class Hospedaje implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private Long requestId;

    @Column(nullable = false, length = 150)
    private String hotelname;

    @Column(nullable = false)
    @Temporal(TemporalType.DATE)
    private Date InDate;

    @Column(nullable = false)
    @Temporal(TemporalType.DATE)
    private Date ExDate;

    @Column(nullable = false)
    @Temporal(TemporalType.DATE)
    private Float TotalCost;

    public Hospedaje(){

    }

    public Hospedaje(Long id, Long requestId, String hotelname, Date inDate, Date exDate, Float totalCost) {
        this.id = id;
        this.requestId = requestId;
        this.hotelname = hotelname;
        InDate = inDate;
        ExDate = exDate;
        TotalCost = totalCost;
    }

    public Hospedaje(Long requestId, String hotelname, Date inDate, Date exDate, Float totalCost) {
        this.requestId = requestId;
        this.hotelname = hotelname;
        InDate = inDate;
        ExDate = exDate;
        TotalCost = totalCost;
    }

    public Long getId() {
        return id;
    }

    public Hospedaje setId(Long id) {
        this.id = id;
        return this;
    }

    public Long getRequestId() {
        return requestId;
    }

    public Hospedaje setRequestId(Long requestId) {
        this.requestId = requestId;
        return this;

    }

    public String getHotelname() {
        return hotelname;
    }

    public Hospedaje setHotelname(String hotelname) {
        this.hotelname = hotelname;
        return this;

    }

    public Date getInDate() {
        return InDate;
    }

    public Hospedaje setInDate(Date inDate) {
        InDate = inDate;
        return this;
    }

    public Date getExDate() {
        return ExDate;

    }

    public Hospedaje setExDate(Date exDate) {
        ExDate = exDate;
        return this;
    }

    public Float getTotalCost() {
        return TotalCost;
    }

    public Hospedaje setTotalCost(Float totalCost) {
        TotalCost = totalCost;
        return this;
    }
}
