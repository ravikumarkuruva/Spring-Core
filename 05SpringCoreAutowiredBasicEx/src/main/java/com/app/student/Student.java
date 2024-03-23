package com.app.student;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Student {
	@Value("Ravi Kumar")
	private String name;
	@Value("Electronics and communication Engineering")
	private String branch;
	@Value("192N1A0411")
	private String rollNo;
	
	
	@Override
	public String toString() {
		return "Student [name=" + name + ", branch=" + branch + ", rollNo=" + rollNo + "]";
	}
	
	
}
