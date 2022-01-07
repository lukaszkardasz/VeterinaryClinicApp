package com.qvetka.veterinaryclinicapp;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.LocalDateTime;

@Entity
public class Animal {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String spiece;
    private String name;
    private double hourPrice;
    private double dayPrice;
    private String ownerId;
    private LocalDateTime dateOfDischarge;

    public Animal() {
    }

    public Animal(String spiece, String name, double hourPrice, double dayPrice) {
        this.spiece = spiece;
        this.name = name;
        this.hourPrice = hourPrice;
        this.dayPrice = dayPrice;
    }

    @Override
    public String toString() {
        return "Zwierzę: " +
                "id=" + id +
                ", gatunek='" + spiece + '\'' +
                ", imię'" + name + '\'' +
                ", hourPrice=" + hourPrice +
                ", dayPrice=" + dayPrice +
                ", id_właściciela='" + ownerId;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getSpiece() {
        return spiece;
    }

    public void setSpiece(String spiece) {
        this.spiece = spiece;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getHourPrice() {
        return hourPrice;
    }

    public void setHourPrice(double hourPrice) {
        this.hourPrice = hourPrice;
    }

    public double getDayPrice() {
        return dayPrice;
    }

    public void setDayPrice(double dayPrice) {
        this.dayPrice = dayPrice;
    }

    public String getOwnerId() {
        return ownerId;
    }

    public void setOwnerId(String ownerId) {
        this.ownerId = ownerId;
    }

    public LocalDateTime getDateOfDischarge() {
        return dateOfDischarge;
    }

    public void setDateOfDischarge(LocalDateTime dateOfDischarge) {
        this.dateOfDischarge = dateOfDischarge;
    }
}
