package net.javag.springboot.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import net.javag.springboot.exception.ResourceNotFoundException;
import net.javag.springboot.model.patient;
import net.javag.springboot.repository.PatientRepository;

@CrossOrigin(origins="http://localhost:4200")
@RestController
@RequestMapping("/api/p1/")
public class PatientController {

	@Autowired
	private PatientRepository  patientRepository;
	
	@GetMapping("/patient")
	public List<patient> getAllPatients(){
		return patientRepository.findAll();
	}	
	
	@PostMapping("/patients")
	public patient createPatient(@RequestBody patient Patient) {
		return patientRepository.save(Patient);
	}
	
	@GetMapping("/patient/{id}")
	public ResponseEntity<patient> getPatientById(@PathVariable Long id){
		patient Patient1 = patientRepository.findById(id).orElseThrow(() -> 
		new ResourceNotFoundException("patient not exist of id =" + id));
		
		return ResponseEntity.ok(Patient1);
	}	
}