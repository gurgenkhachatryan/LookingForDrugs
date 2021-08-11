package com.example.lookingfordrugs.service.drug.impl;

import com.example.lookingfordrugs.persistence.drug.DrugsRepository;
import com.example.lookingfordrugs.persistence.drug.model.Drugs;
import com.example.lookingfordrugs.persistence.pharmacy.PharmacyRepository;
import com.example.lookingfordrugs.rest.drugs.model.DrugsRequestModel;
import com.example.lookingfordrugs.service.drug.DrugService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class DrugServiceImpl implements DrugService {
    @Autowired
    private DrugsRepository drugsRepository;
    @Autowired
    private PharmacyRepository pharmacyRepository;
    @Override
    public void create(DrugsRequestModel drugsRequest) {
         Drugs drugs=new Drugs();
    drugs.setName(drugsRequest.getName());
    drugs.setManufacturer(drugsRequest.getManufacturer());
    drugs.setDateOfProduction(drugsRequest.getDateOfProduction());
    drugs.setShelfLife(drugsRequest.getShelfLife());
    drugs.setPrice(drugsRequest.getPrice());

    drugs.getPharmacies().add(pharmacyRepository.findById(3L).get());
    drugsRepository.save(drugs);
     }

    @Override
    public List<Drugs> search(String str) {
        List<Drugs> all = drugsRepository.findDrugsByNameLike(str);
        return all;
    }

}
