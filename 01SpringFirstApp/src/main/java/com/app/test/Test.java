package com.app.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.app.dbdetails.DBConnection;

public class Test {

	public static void main(String[] args) {
		@SuppressWarnings("unused")
		ApplicationContext ac= new 
				ClassPathXmlApplicationContext("bean.xml");
		System.out.println();

	}

}
