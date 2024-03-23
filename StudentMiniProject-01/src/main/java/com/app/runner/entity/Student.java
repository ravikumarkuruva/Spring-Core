package com.app.runner.entity;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name="Student_Tab")
public class Student {
	@Id
	@Column(name="sid")
	private Integer id;
	
	@Column(name="sname")
	private String name;
	
	@Column(name="sstream")
	private String stream;
	
	@Column(name="clgname")
	private String clgName;
	
	@Column(name="sfeez")
	private Double feez;
}
