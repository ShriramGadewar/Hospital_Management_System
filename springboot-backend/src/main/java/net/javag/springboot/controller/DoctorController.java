package net.javag.springboot.controller;

import java.util.List;
import java.util.Optional;

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
import net.javag.springboot.model.doctor;
import net.javag.springboot.repository.DoctorRepository;

@CrossOrigin(origins="http://localhost:4200")
@RestController
@RequestMapping("/api/d1/")
public class DoctorController {

	@Autowired
	private DoctorRepository doctorRepository;
	
	@GetMapping("/doctor")
	public List<doctor> getAllDoctors(){
		return doctorRepository.findAll();
	}	
	
	@PostMapping("/doctors")
	public doctor createDoctor(@RequestBody doctor Doctor) {
		return doctorRepository.save(Doctor);
	}		
	
	@GetMapping("/doctor/{id}")
	public ResponseEntity<doctor> getDoctorById(@PathVariable Long id){
		doctor Doctor1= doctorRepository.findById(id).orElseThrow(() ->
		new ResourceNotFoundException("Not found"));
		return ResponseEntity.ok(Doctor1);
	}
	
	
	
	
	
}
