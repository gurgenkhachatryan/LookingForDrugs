package com.example.lookingfordrugs.rest.drugs.model;

import org.springframework.beans.factory.annotation.Autowired;

public class DrugsRequestModel {
    @Autowired
    private long id;
    private String name;
    private String manufacturer;
    private String dateOfProduction;
    private int shelfLife;
    private int price;

    public DrugsRequestModel() {
    }

    public DrugsRequestModel(long id, String name, String manufacturer, String dateOfProduction, int shelfLife, int price) {
        this.id = id;
        this.name = name;
        this.manufacturer = manufacturer;
        this.dateOfProduction = dateOfProduction;
        this.shelfLife = shelfLife;
        this.price = price;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getDateOfProduction() {
        return dateOfProduction;
    }

    public void setDateOfProduction(String dateOfProduction) {
        this.dateOfProduction = dateOfProduction;
    }

    public int getShelfLife() {
        return shelfLife;
    }

    public void setShelfLife(int shelfLife) {
        this.shelfLife = shelfLife;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
