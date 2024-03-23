package com.app.runner.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.app.runner.entity.Student;
import com.app.runner.service.IStudentService;

@Controller
@RequestMapping("/student")
public class StudentController {
	
	@Autowired
	private IStudentService service;
	
	@GetMapping("/register")
	public String showPage(Model model) {
		
		return "StudentRegister";
	}
	
	@PostMapping("/save")
	public String saveStudent(@ModelAttribute Student student, Model model) {
		
		Integer id=service.saveStudent(student);
		String message ="Student '"+id+"' is Registered Successfully...";
		model.addAttribute("message", message);
		return "StudentRegister";
		
	}@GetMapping("/all")
	public String getAllStudents(@RequestParam(value="id",required=false)Integer id, Model model) {
		List<Student>list=service.getAllStudents();
		
		model.addAttribute("list",list);		
		return "StudentData";
		
	}
	
	
	
	
	
	
	
	
}
