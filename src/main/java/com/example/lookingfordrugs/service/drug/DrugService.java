package com.example.lookingfordrugs.service.drug;

import com.example.lookingfordrugs.persistence.drug.model.Drugs;
import com.example.lookingfordrugs.rest.drugs.model.DrugsRequestModel;

import java.util.List;

public interface DrugService {
    void create(DrugsRequestModel drugsRequest);
    List<Drugs> search(String str);
}
