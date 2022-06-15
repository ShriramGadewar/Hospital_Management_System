package net.javag.springboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
}
