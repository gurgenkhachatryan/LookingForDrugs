package com.example.lookingfordrugs.rest.pharmacy.model;

import org.springframework.beans.factory.annotation.Autowired;

public class PharmacyRequestModel {
    @Autowired
    private long id;
    private String name;
    private String address;
    private String phoneNumber;
    private String workingHours;
    private long pharmacy_manager_id;

    public PharmacyRequestModel() {
    }

    public PharmacyRequestModel(long id, String name, String address, String phoneNumber, String workingHours, long pharmacy_manager_id) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.workingHours = workingHours;
        this.pharmacy_manager_id = pharmacy_manager_id;
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

    public long getPharmacy_manager_id() {
        return pharmacy_manager_id;
    }

    public void setPharmacy_manager_id(long pharmacy_manager_id) {
        this.pharmacy_manager_id = pharmacy_manager_id;
    }
}


