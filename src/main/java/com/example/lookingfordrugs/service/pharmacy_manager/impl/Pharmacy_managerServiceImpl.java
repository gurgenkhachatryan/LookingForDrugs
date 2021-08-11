package com.example.lookingfordrugs.service.pharmacy_manager.impl;

import com.example.lookingfordrugs.persistence.pharmacy_manager.Pharmacy_managerRepository;
import com.example.lookingfordrugs.persistence.pharmacy_manager.model.Pharmacy_manager;
import com.example.lookingfordrugs.rest.pharmacy_manager.model.Pharmacy_managerRequestModel;
import com.example.lookingfordrugs.service.pharmacy_manager.Pharmacy_managerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Pharmacy_managerServiceImpl implements Pharmacy_managerService {
    @Autowired
    private Pharmacy_managerRepository pharmacy_managerRepository;
    @Override
    public void create(Pharmacy_managerRequestModel pharmacy_managerRequest) {
        Pharmacy_manager pharmacy_manager=new Pharmacy_manager();
    pharmacy_manager.setName(pharmacy_managerRequest.getName());
    pharmacy_manager.setSurname(pharmacy_managerRequest.getSurname());
    pharmacy_manager.setEmail(pharmacy_managerRequest.getEmail());
    pharmacy_manager.setLogin(pharmacy_managerRequest.getLogin());
    pharmacy_manager.setPassword(pharmacy_managerRequest.getPassword());
    pharmacy_managerRepository.save(pharmacy_manager);

    }
}
