package com.app.runners.bean;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class BookDetails {
	
	private Integer Id;
	private String name;
	private String author;
	private double price;
}
