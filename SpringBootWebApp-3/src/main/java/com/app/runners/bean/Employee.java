package com.app.runners.bean;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Employee {
	private int empId;
	private String eName;
	private double eSal ;
	private String ePwd;
	private String eDept;
	private String eAddr;
}
