package com.app.Config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import com.app.student.Student;

@Component
@ComponentScan("com.app")
@Configuration
public class Config {
	
	@Bean
	public Student m1() {
		Student st1=new Student();
		return st1;
	}
	
	@Bean
	public Student m2() {
		Student st2=new Student();
		return st2;
	}
}
