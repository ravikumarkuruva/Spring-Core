package com.app.college;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import com.app.student.Student;
@Component
public class College {
	@Autowired
	private Student std;
	@Value("Brindavan Institute Of Technology And Science")
	private String clgName;
	@Value("BRANK")
	private String clgcode;
	@Override
	public String toString() {
		return "College [std=" + std + ", clgName=" + clgName + ", clgcode=" + clgcode + "]";
	}
	
	
	
}
