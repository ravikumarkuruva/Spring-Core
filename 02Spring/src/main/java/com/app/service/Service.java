package com.app.service;

import com.app.repo.Respository;

public class Service {
	private Respository repo;

	public Service() {
		super();
	}

	public Service(Respository repo) {
		super();
		this.repo = repo;
	}

	public Respository getRepo() {
		return repo;
	}

	public void setRepo(Respository repo) {
		this.repo = repo;
	}

	@Override
	public String toString() {
		return "Service [repo=" + repo + "]";
	}
	
}
