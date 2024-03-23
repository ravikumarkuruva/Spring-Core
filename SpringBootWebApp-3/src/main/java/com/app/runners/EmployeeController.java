package com.app.runners;



import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.app.runners.bean.Employee;



@Controller
@RequestMapping("/emp")
public class EmployeeController {
	@GetMapping("/show")
	public String showData() {
		return"UserRegister";
	}
	@GetMapping("/reg")
	public String readData(	@ModelAttribute Employee employee, Model model) {
		//System.out.println(employee);
		model.addAttribute("obj", employee);
		return "UserDetails";
		
	}
}
