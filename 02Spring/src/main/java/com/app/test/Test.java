package com.app.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.app.service.Service;

public class Test {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		ApplicationContext ac= new 
				ClassPathXmlApplicationContext("bean.xml");
		Object obj=(Service)ac.getBean("ser");
		System.out.println(obj);

	}

}
