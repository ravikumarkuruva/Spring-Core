package com.app.runners;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name="Student_tab")
public class Student {
	@Id
	@Column(name="slNo")
	private Integer slno;
	@Column(name="Name")
	private String stdname;
	@Column(name="RollNo")
	private String rollNo;
	@Column(name="Stream")
	private String stream;
}
