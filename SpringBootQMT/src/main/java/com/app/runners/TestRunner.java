package com.app.runners;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.app.runners.entity.College;
import com.app.runners.repo.CollegeRepository;
@Component
public class TestRunner implements CommandLineRunner {
	@Autowired
	CollegeRepository repo;
	@Override
	public void run(String... arg0) throws Exception {
		repo.saveAll(
				Arrays.asList(
						new College(1021, "BITS", "KNL"),
						new College(1022, "SBR", "KNL"),
						new College(1023, "PULLAREDDY", "KNL"),
						new College(1024, "ASHOKA", "KNL"),
						new College(1025, "RAVINDRA", "KNL"),
						new College(1026, "GPCET", "KNL")
						)
				
				);
		repo.updateNameById("Brindavan Institute Of Technology And Sciences", 1021);
	}

}
