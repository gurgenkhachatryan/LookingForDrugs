package com.example.lookingfordrugs.rest.pharmacy;

import com.example.lookingfordrugs.persistence.pharmacy_manager.Pharmacy_managerRepository;
import com.example.lookingfordrugs.persistence.pharmacy.model.Pharmacy;
import com.example.lookingfordrugs.persistence.pharmacy.PharmacyRepository;
import com.example.lookingfordrugs.rest.pharmacy.model.PharmacyRequestModel;
import com.example.lookingfordrugs.persistence.pharmacy_manager.model.Pharmacy_manager;
import com.example.lookingfordrugs.service.pharmacy.PharmacyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PharmacyController {
  @Autowired
  PharmacyService pharmacyService;

    @PostMapping("/create/pharmacy")
    public String addPharmacy(@RequestBody PharmacyRequestModel pharmacyRequest)
    {
        pharmacyService.create(pharmacyRequest);
  return "ok pharmacy";
    }
}
