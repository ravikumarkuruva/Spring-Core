package com.app.runners.rest;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.runners.entity.User;

@RestController
@RequestMapping("/user")
public class UserController {
	
	//1.Object's data is converting into JSON
	@GetMapping("/obj")
	public ResponseEntity<User> getOneObj(){
		User ob=	new User(101,"Ravi" ,"Developer");
		ResponseEntity<User> response=new ResponseEntity<>(ob,HttpStatus.OK);
		return response;
	}
	
	//2.List Of objects is converting into JSON
	@GetMapping("/list")
	public ResponseEntity<List<User>> getListOfObj(){
		List<User> list=
				Arrays.asList(
				new User(101, "Ravi Kumar", "DEV"),
				new User(101, "Priyanka Jain", "ACTORESS"),
				new User(101, "Amardeep", "ACTOR"),
				new User(101, "Kumar", "TESTING"),
				new User(101, "Prashanth", "PROD")
				);
		ResponseEntity<List<User>> responce=new ResponseEntity<>(list,HttpStatus.OK);
		return responce;
	}
	
	//3.Map Of objects is converting into JSON
	@GetMapping("/map")
	public ResponseEntity<Map<String,User>> getMapOfObj(){
		Map<String, User> map=Map.of(
				"R1",new User(101,"Ravi Kumar","DEV"),
				"R2",new User(102,"Ravi","QA"),
				"R3",new User(103,"Kumar","PROD")
				);
		
		ResponseEntity<Map<String,User>> response=new ResponseEntity<>
					(map,HttpStatus.OK);
		
		return response;
		
	}
}











