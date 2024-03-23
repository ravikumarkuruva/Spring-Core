package com.app.runners;

import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Order(10)
public class DBCon implements CommandLineRunner {

	@Override
	public void run(String... args) throws Exception {
		System.out.println("DBCON IS CALLED...");

	}

}
