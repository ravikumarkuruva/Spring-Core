package com.app.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.app.config.MyConfig;
import com.app.dbcon.DBCon;

public class Test {

	public static void main(String[] args) {
		ApplicationContext ac=new 
				AnnotationConfigApplicationContext(MyConfig.class);
		Object obj=ac.getBean("dbcon");
		System.out.println(obj);

	}

}
