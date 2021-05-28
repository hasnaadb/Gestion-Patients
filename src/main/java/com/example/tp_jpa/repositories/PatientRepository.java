package com.example.tp_jpa.repositories;





import org.springframework.data.domain.Page;
import org.springframework.data.jpa.repository.JpaRepository;

import com.example.tp_jpa.entities.Patient;


public interface PatientRepository extends JpaRepository<Patient, Long> {
	public Page<Patient> findByNameContains(String mc, 
			org.springframework.data.domain.Pageable pageable);
}
