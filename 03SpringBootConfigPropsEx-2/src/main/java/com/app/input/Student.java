package com.app.input;

import java.util.List;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties("my.app")
public class Student {
//	private String name;
//	private String branch;
//	private String rollno;
//	private String year;
//	public Student(String name, String branch, String rollno, String year) {
//		super();
//		this.name = name;
//		this.branch = branch;
//		this.rollno = rollno;
//		this.year = year;
//	}
//	public Student() {
//		super();
//	}
//	public String getName() {
//		return name;
//	}
//	public void setName(String name) {
//		this.name = name;
//	}
//	public String getBranch() {
//		return branch;
//	}
//	public void setBranch(String branch) {
//		this.branch = branch;
//	}
//	public String getRollno() {
//		return rollno;
//	}
//	public void setRollno(String rollno) {
//		this.rollno = rollno;
//	}
//	public String getYear() {
//		return year;
//	}
//	public void setYear(String year) {
//		this.year = year;
//	}
//	@Override
//	public String toString() {
//		return "Student [name=" + name + ", branch=" + branch + ", rollno=" + rollno + ", year=" + year + "]";
//	}
	
	 private List<String>l1;

	public List<String> getL1() {
		return l1;
	}

	public void setL1(List<String> l1) {
		this.l1 = l1;
	}

	@Override
	public String toString() {
		return "Student [l1=" + l1 + "]";
	}
	 
	 
	
	
}
