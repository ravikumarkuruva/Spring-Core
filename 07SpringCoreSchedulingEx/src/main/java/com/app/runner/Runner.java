package com.app.runner;

import java.util.Date;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
@Component
public class Runner {
	
	@Scheduled(fixedDelay = 2000)
	public void m1() {
		System.out.println("Hellow "+new Date());
	}
	
}
