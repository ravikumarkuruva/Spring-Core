package com.app.runner.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.runner.entity.Patient;
import com.app.runner.service.IPatientService;

@RestController
@RequestMapping("/patient")
public class PatientController {
	
	@Autowired
	private IPatientService service;
	
	@PostMapping("/create")
	public ResponseEntity<String> savePatient(
			@RequestBody Patient patient
			){
		Integer id=service.savePatient(patient);
		String message="PATIENT ID '"+id+"' IS ENTERED SUCCESSFULLY...";
		return new ResponseEntity<>(message,HttpStatus.OK);
	}
	@GetMapping("/all")
	public ResponseEntity<List<Patient>> getAll(){
		List<Patient> list=service.getAllPatients();
		return new ResponseEntity<List<Patient>>(list,HttpStatus.OK);
	}
	
	@DeleteMapping("/delete/{id}")
	public ResponseEntity<String> remove(
			@PathVariable("id") Integer id
			){
		service.deletePatient(id);
		String message="PATIENT ID '"+id+"' DELETED SUCCESSFULLY.... ";
		return new ResponseEntity<String>(message,HttpStatus.OK);
	}
	
	@PutMapping("/update")
	public ResponseEntity<String> updatePatient(
			@RequestBody Patient patient
			){
		
		service.updatePatient(patient);
		String message = "PATIENT ID '"+patient.getId()+"' UPDATED SUCCESSFULLY....";
		return new ResponseEntity<String>(message,HttpStatus.OK);
	}
}




















