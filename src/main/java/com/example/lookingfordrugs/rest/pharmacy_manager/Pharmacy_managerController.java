package com.example.lookingfordrugs.rest.pharmacy_manager;

import com.example.lookingfordrugs.persistence.pharmacy_manager.model.Pharmacy_manager;
import com.example.lookingfordrugs.persistence.pharmacy_manager.Pharmacy_managerRepository;
import com.example.lookingfordrugs.rest.pharmacy_manager.model.Pharmacy_managerRequestModel;
import com.example.lookingfordrugs.service.pharmacy_manager.Pharmacy_managerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Pharmacy_managerController {
@Autowired
    Pharmacy_managerService pharmacy_managerService;

@PostMapping("/create/pharmacy_manager")
    public String addPharmacy_manager(@RequestBody Pharmacy_managerRequestModel pharmacy_managerRequest){

    pharmacy_managerService.create(pharmacy_managerRequest);
    return "ok pharmacy_manager";
}

}
