package com.app.input;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
@Component
public class Runner implements CommandLineRunner {
	
	@Autowired
	private DBConnection dbcon;
	@Override
	public void run(String... args) throws Exception {
		System.out.println(dbcon);

	}

}
