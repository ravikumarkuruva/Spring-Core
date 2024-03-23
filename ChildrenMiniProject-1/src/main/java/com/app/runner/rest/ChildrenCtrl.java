package com.app.runner.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.runner.entity.Children;  
import com.app.runner.service.IChildrenService;

@RestController
@RequestMapping("/children")
public class ChildrenCtrl {
	@Autowired
	IChildrenService service;
	
	@PostMapping("/create")
	public String saveChild(@RequestBody Children children ) {
		service.saveChild(children);
		return "Children '"+children.getName()+"' saved Successfully...";
	}
	
	@DeleteMapping("/remove/{id}")
	public String deleteChild(@PathVariable Integer id) {
		service.deleteChild(id);
		return "Child '"+id+"' Deleted Successfully...";
	}
	
	@GetMapping("/find/{id}")
	public Children find(@PathVariable Integer id) {
		return service.getChildById(id);
	}	
	
	
	
	
	
	
	
	
	
	
	
}
