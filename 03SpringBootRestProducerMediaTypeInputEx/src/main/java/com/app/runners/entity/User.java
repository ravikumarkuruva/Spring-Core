package com.app.runners.entity;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class User {
	@GetMapping("/find")
	public ResponseEntity<String> readId1(
		@RequestParam("pid")Integer id,
		@RequestParam("name")String name
			){
		ResponseEntity<String> response=
					new ResponseEntity("PID = "+id+" \nNAME = "+name,HttpStatus.OK);
				return response;
		
	}
	@GetMapping("/save/{pid}/{name}")
	public ResponseEntity<String> readId2(
			@PathVariable("pid")Integer id,
			@PathVariable("name")String name
			){
		String str="Id = "+id
				+"\nName = "+name;
				return new ResponseEntity(str, HttpStatus.OK);
		
	}
}
