package com.example.lookingfordrugs.service.pharmacy.impl;

import com.example.lookingfordrugs.persistence.pharmacy.PharmacyRepository;
import com.example.lookingfordrugs.persistence.pharmacy.model.Pharmacy;
import com.example.lookingfordrugs.persistence.pharmacy_manager.Pharmacy_managerRepository;
import com.example.lookingfordrugs.persistence.pharmacy_manager.model.Pharmacy_manager;
import com.example.lookingfordrugs.rest.pharmacy.model.PharmacyRequestModel;
import com.example.lookingfordrugs.service.pharmacy.PharmacyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PharmacyServiceImpl implements PharmacyService {
    @Autowired
    private Pharmacy_managerRepository pharmacy_managerRepository;
    @Autowired
    private PharmacyRepository pharmacyRepository;
    @Override
    public void create(PharmacyRequestModel pharmacyRequest) {
              Pharmacy pharmacy=new Pharmacy();
        pharmacy.setName(pharmacyRequest.getName());
        pharmacy.setAddress(pharmacyRequest.getAddress());
        pharmacy.setWorkingHours(pharmacyRequest.getWorkingHours());
        pharmacy.setPhoneNumber(pharmacyRequest.getPhoneNumber());

        Pharmacy_manager pharmacy_manager = pharmacy_managerRepository.findById(2L).get();
        pharmacy.setPharmacy_manager(pharmacy_manager);

        pharmacyRepository.save(pharmacy);

    }
}
