package com.example.lookingfordrugs.persistence.drug;

import com.example.lookingfordrugs.persistence.drug.model.Drugs;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface DrugsRepository extends JpaRepository<Drugs,Long> {
    public List<Drugs> findDrugsByNameLike(String str);
}
