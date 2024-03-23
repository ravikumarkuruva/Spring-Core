package com.app.runner.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name="Patient_Tab")
public class Patient {
	@Id
	@Column(name="pid")
	private Integer id;

	@Column(name="pname")
	private String name;
	
	@Column(name="pdocterName")
	private String docterName;
	
	@Column(name="pfees")
	private Double fees;
}
