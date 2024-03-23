package com.app.runners;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.app.runners.bean.Student;

@Controller
public class StudentController {
	@GetMapping("/abc")
	public String showData(Model model) {
		
		Student std=new Student("Ravi Kumar", "Full Stack Java");
		model.addAttribute("std", std);
		return "Userreg";
	}
}
