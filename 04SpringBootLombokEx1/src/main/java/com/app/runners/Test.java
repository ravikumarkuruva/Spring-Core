package com.app.runners;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import lombok.Data;
@Component
@Data
public class Test implements CommandLineRunner {
	@Autowired
	private Process prs;
	@Override
	public void run(String... args) throws Exception {
		System.out.println(prs);
	}

}
