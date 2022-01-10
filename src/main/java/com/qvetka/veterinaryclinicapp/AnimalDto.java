package com.qvetka.veterinaryclinicapp;

import java.time.LocalDateTime;

public class AnimalDto {
    private Long id;
    private String spiece;
    private String name;
    private String gender;
    private String color;
    private String coatTypeMarking;
    private String distinguishingMarks;
    private String demographicRegistrationNumber;
    private String tatooNumber;
    private double hourPrice;
    private double dayPrice;
    private String ownerId;
    private LocalDateTime dateOfDischarge;

    public AnimalDto(String spiece, String name, String gender, String color, String coatTypeMarking, String distinguishingMarks, String demographicRegistrationNumber, String tatooNumber, double hourPrice, double dayPrice) {
        this.spiece = spiece;
        this.name = name;
        this.gender = gender;
        this.color = color;
        this.coatTypeMarking = coatTypeMarking;
        this.distinguishingMarks = distinguishingMarks;
        this.demographicRegistrationNumber = demographicRegistrationNumber;
        this.tatooNumber = tatooNumber;
        this.hourPrice = hourPrice;
        this.dayPrice = dayPrice;
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

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getCoatTypeMarking() {
        return coatTypeMarking;
    }

    public void setCoatTypeMarking(String coatTypeMarking) {
        this.coatTypeMarking = coatTypeMarking;
    }

    public String getDistinguishingMarks() {
        return distinguishingMarks;
    }

    public void setDistinguishingMarks(String distinguishingMarks) {
        this.distinguishingMarks = distinguishingMarks;
    }

    public String getDemographicRegistrationNumber() {
        return demographicRegistrationNumber;
    }

    public void setDemographicRegistrationNumber(String demographicRegistrationNumber) {
        this.demographicRegistrationNumber = demographicRegistrationNumber;
    }

    public String getTatooNumber() {
        return tatooNumber;
    }

    public void setTatooNumber(String tatooNumber) {
        this.tatooNumber = tatooNumber;
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

    @Override
    public String toString() {
        return "AnimalDto{" +
                "id=" + id +
                ", spiece='" + spiece + '\'' +
                ", name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", color='" + color + '\'' +
                ", coatTypeMarking='" + coatTypeMarking + '\'' +
                ", distinguishingMarks='" + distinguishingMarks + '\'' +
                ", demographicRegistrationNumber='" + demographicRegistrationNumber + '\'' +
                ", tatooNumber='" + tatooNumber + '\'' +
                ", hourPrice=" + hourPrice +
                ", dayPrice=" + dayPrice +
                ", ownerId='" + ownerId + '\'' +
                ", dateOfDischarge=" + dateOfDischarge +
                '}';
    }
}
