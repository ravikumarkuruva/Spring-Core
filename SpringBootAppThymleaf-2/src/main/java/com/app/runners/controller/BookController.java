package com.app.runners.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.app.runners.bean.BookDetails;

@Controller
@RequestMapping("/book")
public class BookController {
	@GetMapping("/show")
	public String showData(Model model) {
		
		BookDetails b1=new BookDetails(101, "CoreJava", "HariKrisha", 2500.0);
		model.addAttribute("book", b1);
		return "Book";
	}
	@GetMapping("/coll")
	public String showColl(Model model) {
		List<BookDetails> list=new ArrayList<>(
				Arrays.asList(
						new BookDetails(101, "CoreJava", "Hari Krishna", 2500.0),
						new BookDetails(102, "AdvJava", "Venkatesh Maipathi", 4000.0),
						new BookDetails(103, "Oracle", "Sudhakar Lada", 2500.0),
						new BookDetails(104, "HTML,CSS,JavaScript", "Venkatesh Mansaani", 2500.0),
						new BookDetails(105, "SBMC", "Raghu", 2500.0)
						));
		model.addAttribute("list", list);
		return "BookColl";
	}
}
