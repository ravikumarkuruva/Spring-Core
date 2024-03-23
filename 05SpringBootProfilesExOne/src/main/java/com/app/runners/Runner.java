package com.app.runners;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
@Component
public class Runner implements CommandLineRunner {
	@Autowired
	private Example exe;
	@Override
	public void run(String... args) throws Exception {
		System.out.println(exe);
	}

}
