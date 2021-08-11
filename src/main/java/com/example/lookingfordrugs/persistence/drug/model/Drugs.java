package com.example.lookingfordrugs.persistence.drug.model;

import com.example.lookingfordrugs.persistence.pharmacy.model.Pharmacy;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Drugs {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String manufacturer;
    private String dateOfProduction;
    private int shelfLife;
    private int price;
    @ManyToMany( cascade = CascadeType.ALL)
    private List<Pharmacy> pharmacies = new ArrayList<>();

    public Drugs() {
    }

    public Drugs(Long id, String name, String manufacturer, String dateOfProduction, int shelfLife, int price) {
        this.id = id;
        this.name = name;
        this.manufacturer = manufacturer;
        this.dateOfProduction = dateOfProduction;
        this.shelfLife = shelfLife;
        this.price = price;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
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

    public List<Pharmacy> getPharmacies() {
        return pharmacies;
    }

    public void setPharmacies(List<Pharmacy> pharmacies) {
        this.pharmacies = pharmacies;
    }
}