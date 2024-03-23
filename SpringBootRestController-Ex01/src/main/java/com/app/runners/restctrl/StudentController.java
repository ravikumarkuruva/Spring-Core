package com.app.runners.restctrl;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/student")
public class StudentController {
	//1.Fetch Resource
	
	@GetMapping("/fetch")
	public ResponseEntity<String> getStudent(){
		ResponseEntity<String> response=new ResponseEntity<>(
				"FROM GET OPERATION",
				HttpStatus.OK
				);
	
		return response;
	}
	//2.Create Resource
	
	@PostMapping("/save")
	public ResponseEntity<String> createStudent(){
		
		ResponseEntity<String> response=new ResponseEntity<>(
				"FROM POST METHOD",
				HttpStatus.OK
				);
		return response;
	}
	//3.Modify Resource
	
	@PutMapping("/update")
	public ResponseEntity<String> updateStudent(){
		ResponseEntity<String> responce=new ResponseEntity<String>(
			"FROM PUT METHOD", 
			HttpStatus.OK
			);
		return responce;
	}
	//4.Remove Resource
	
	@DeleteMapping("/remove")
	public ResponseEntity<String> deleteStudent(){
		ResponseEntity<String> responce=new ResponseEntity<>(
				"FROM DELETE METHOD",
				HttpStatus.OK
				);
		return responce;
	}
	//5.Update Resource Partially
	
	@PatchMapping("/emailupdate")
	public ResponseEntity<String> updatePartially(){
		
		ResponseEntity<String> responce=new ResponseEntity<String>(
				"FROM PATCH METHOD",
				HttpStatus.OK
				);
		return responce;
		
	}
}
