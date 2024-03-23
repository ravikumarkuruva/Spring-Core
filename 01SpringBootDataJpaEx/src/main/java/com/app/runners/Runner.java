package com.app.runners;

import java.util.Arrays;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
@Component
public class Runner implements CommandLineRunner {
	@Autowired
	private StudentRepository repo;
	@Override
	public void run(String... args) throws Exception {
		System.out.println(repo.getClass().getName());
		
		Student std1=new Student(101, "Ravi Kumar", "192N1A0411", "ECE");
		Student std2=new Student(102, "Priyanka Jain", "192N1A0413", "CSE");
		Student std3=new Student(103, "Shiv", "192N1A0412", "MECH");
		Student std4=new Student(104, "Koushik", "192N1A0410", "CIVIL");
		Student std5=new Student(105, "Dhakshit", "192N1A0405", "EEE");
		
		repo.saveAll((Arrays.asList(std1, std2, std3, std4, std5)));
		
		
		System.out.println("**** ForEach  ***** FindAll() .....");
		repo.findAll().forEach(System.out::println);
		
		System.out.println("**** ForEach  ***** FindAll() .....");
		Optional<Student> n=repo.findById(101);
		if (n.isPresent()) {
			System.out.println(n);
		} else {
			System.out.println("No Records Found...");
		}
	}

}
