package com.example.tp_jpa.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.tp_jpa.entities.Patient;
import com.example.tp_jpa.repositories.PatientRepository;

@RestController
public class PatientRestController {
	@Autowired
	private PatientRepository patientRepository;
		@GetMapping("/listPatient")
		public List<Patient> list(Long id) {
				return patientRepository.findAll();
		}
		
		@GetMapping("/patients/{id}")
		public Patient getOne(@PathVariable Long id) {
			return patientRepository.findById(id).get();
		}
	
}