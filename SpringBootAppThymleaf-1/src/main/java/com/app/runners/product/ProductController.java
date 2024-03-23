package com.app.runners.product;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/product")
public class ProductController {
	@GetMapping("/data")
	public String showData(Model model) {
		model.addAttribute("prodcode", "SAMPLE ABC!!!");
		return "ProductData";
	}
}
