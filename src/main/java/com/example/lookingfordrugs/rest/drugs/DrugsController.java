package com.example.lookingfordrugs.rest.drugs;

import com.example.lookingfordrugs.persistence.pharmacy.PharmacyRepository;
import com.example.lookingfordrugs.persistence.drug.model.Drugs;
import com.example.lookingfordrugs.persistence.drug.DrugsRepository;
import com.example.lookingfordrugs.persistence.pharmacy.model.Pharmacy;
import com.example.lookingfordrugs.rest.drugs.model.DrugsRequestModel;
import com.example.lookingfordrugs.rest.pharmacy.model.PharmacyResponseModel;
import com.example.lookingfordrugs.service.drug.DrugService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class DrugsController {
/*@Autowired
    private DrugsRepository drugsRepository;*/
@Autowired
    DrugService drugService;


@PostMapping("/create/drugs")

    public String addDrugs(@RequestBody DrugsRequestModel drugsRequest)
{

    drugService.create(drugsRequest);
   ///////////////////
return "ok";
}
@GetMapping("/search/drugs")
    public List<Drugs> search(@RequestBody String str){
    List<Drugs> search = drugService.search(str);
    return search;
}


}
