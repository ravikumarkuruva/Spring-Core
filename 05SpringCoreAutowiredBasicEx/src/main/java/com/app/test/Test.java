package com.app.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.app.config.Config;

public class Test {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		ApplicationContext ac=new 
				AnnotationConfigApplicationContext(Config.class);
		Object obj=ac.getBean("college");
		System.out.println(obj);

	}

}
