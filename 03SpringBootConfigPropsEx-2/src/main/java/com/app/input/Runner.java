package com.app.input;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
@Component
public class Runner implements CommandLineRunner {
	@Autowired
	private Student std;
	@Autowired
	private College clg;
	@Override
	public void run(String... args) throws Exception {
		System.out.println(std);
		System.out.println(clg);

	}

}
