package com.example.lookingfordrugs.persistence.pharmacy;

import com.example.lookingfordrugs.persistence.pharmacy.model.Pharmacy;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PharmacyRepository extends JpaRepository<Pharmacy,Long> {

}
