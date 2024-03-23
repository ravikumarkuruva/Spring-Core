package com.app.college;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.app.student.Student;
@Component
public class College {
	@Autowired
	@Qualifier("m1")
	private Student std;

	@Override
	public String toString() {
		return "College [std=" + std + "]";
	}
	
	
}
