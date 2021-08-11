package com.example.lookingfordrugs.persistence.pharmacy.model;

import com.example.lookingfordrugs.persistence.drug.model.Drugs;
import com.example.lookingfordrugs.persistence.pharmacy_manager.model.Pharmacy_manager;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Pharmacy {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String name;
    private String address;
    private String phoneNumber;
    private String workingHours;

    @ManyToOne(cascade = CascadeType.ALL)
    private Pharmacy_manager pharmacy_manager;
    @ManyToMany(cascade = CascadeType.ALL,mappedBy = "pharmacies")
    private List<Drugs> drugs=new ArrayList<>();


    public Pharmacy() {
    }

    public Pharmacy(long id, String name, String address, String phoneNumber, String workingHours,  Pharmacy_manager pharmacy_manager) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.workingHours = workingHours;
      this.pharmacy_manager = pharmacy_manager;
    }

    public Pharmacy_manager getPharmacy_manager() {
        return pharmacy_manager;
    }

    public void setPharmacy_manager(Pharmacy_manager pharmacy_manager) {
        this.pharmacy_manager = pharmacy_manager;
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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getWorkingHours() {
        return workingHours;
    }

    public void setWorkingHours(String workingHours) {
        this.workingHours = workingHours;
    }



}
