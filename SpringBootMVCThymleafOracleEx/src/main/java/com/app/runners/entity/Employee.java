package com.app.runners.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name="Emp_Tab")
public class Employee {
	@Id
	@Column(name="eid")
	//@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer empId;
	
	@Column(name="ename")
	private String empName;
	
	@Column(name="esal")
	private Double empSal;
	
	@Column(name="ehra")
	private Double emphra;
	
	@Column(name="eta")
	private Double empta;
	
	@Column(name="edept")
	private String empDept;
}
