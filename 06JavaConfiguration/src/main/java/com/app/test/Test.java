package com.app.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.app.Config.Config;
import com.app.college.College;


public class Test {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		ApplicationContext ac= new 
				AnnotationConfigApplicationContext(Config.class);
		College std=ac.getBean("college",College.class);
		System.out.println(std);

	}

}
