package com.app.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.app.config.Config;
import com.app.runner.Runner;

public class Test {

	public static void main(String[] args) {
		ApplicationContext ac= new 
				AnnotationConfigApplicationContext(Config.class);
		Runner rnr=ac.getBean("runner",Runner.class);
		System.out.println(rnr);
	}

}
