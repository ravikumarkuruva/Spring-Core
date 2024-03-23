package com.app.runner.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name="Children_Tab")
public class Children {
	@Id
	@Column(name="cid")
	private Integer id;
	
	@Column(name="cname")
	private String name;

	@Column(name="cage")
	private Integer age;
}
