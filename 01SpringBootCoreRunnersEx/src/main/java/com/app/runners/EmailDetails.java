package com.app.runners;

import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;
@Component
@Order(20)
public class EmailDetails implements CommandLineRunner {

	@Override
	public void run(String... args) throws Exception {
		System.out.println("EmailDetails Is Called");

	}

}
