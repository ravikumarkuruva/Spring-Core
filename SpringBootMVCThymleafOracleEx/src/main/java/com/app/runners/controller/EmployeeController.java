package com.app.runners.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.app.runners.entity.Employee;
import com.app.runners.service.IEmployeeService;

@Controller
@RequestMapping("/employee")
public class EmployeeController {
	@Autowired
	private IEmployeeService service;
	/**
	 *ShowRegister
	 *this method is used to show the registration page
	 *when end-user enters /register in URL	 
	 *
	 */
	@GetMapping("/register")
	public String showRegPage(Model model) {
		
		return "EmployeeRegister";
	}
	
	/**
	 * SUBBMTING DATA ON CLICK
	 */
	@PostMapping("/save")
	public String saveData(@ModelAttribute Employee employee, Model model) {
		Integer i1= service.saveEmployee(employee);
		String message="Employee"+i1+"is Registered";
		model.addAttribute("message", message);
		return "EmployeeRegister";
	}
	@GetMapping("/data")
	public String employeesData(@RequestParam(value="message", required = false)String message, Model model) {
		
		List<Employee>list=service.getAllEmployees();
		
		model.addAttribute("list", list);
		model.addAttribute("message", message);
		
		return "EmployeesData";
	}
	@GetMapping("/delete")
	public String deleteEmployee(@RequestParam("id")int empId,Model model,RedirectAttributes attributes) {
		service.deleteEmployee(empId);
		String message="Employee '"+empId+"' Deleted Successfully.";
		model.addAttribute(message, message);
		return "redirect:data";
	}
	
	
	
	
	
	
	
	
}
