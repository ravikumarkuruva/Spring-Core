package com.app.runners.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name="college_details")
public class College {
	@Id
	@Column(name="ccode")
	private Integer code;
	@Column(name = "cname")
	private String name;
	@Column(name="cloc")
	private String loc;
}
