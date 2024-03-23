package com.app.runner.entity;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.runner.exception.UserNotFoundException;

@RestController
@RequestMapping("/user")
public class User {
	@GetMapping("/find/{id}")
	public ResponseEntity<String> getId(@PathVariable("id")int id){
		//ResponseEntity<String> resonse;
		if (id==100)
			return new ResponseEntity<>("RECORD FOUND",HttpStatus.OK);
		else
			throw new UserNotFoundException("NO USER FOUND WITH '"+id+"'");
	}
}
