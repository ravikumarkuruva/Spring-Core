package com.app.repo;

public class Respository {
	private String entity;

	public Respository() {
		super();
	}

	public Respository(String entity) {
		super();
		this.entity = entity;
	}

	public String getEntity() {
		return entity;
	}

	public void setEntity(String entity) {
		this.entity = entity;
	}

	@Override
	public String toString() {
		return "Respository [entity=" + entity + "]";
	}
	
	 
}
