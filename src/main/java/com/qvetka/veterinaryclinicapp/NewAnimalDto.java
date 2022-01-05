package com.qvetka.veterinaryclinicapp;

public class NewAnimalDto {
    private Long id;
    private String spiece;
    private String name;
    private double hourPrice;
    private double dayPrice;

    public NewAnimalDto(Long id, String spiece, String name, double hourPrice, double dayPrice) {
        this.id = id;
        this.spiece = spiece;
        this.name = name;
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
}
