package com.app.input;

import java.util.List;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties("my.app")
public class College {
	List <String> l1;

	public List<String> getL1() {
		return l1;
	}

	public void setL1(List<String> l1) {
		this.l1 = l1;
	}

	@Override
	public String toString() {
		return "College [l1=" + l1 + "]";
	}
	
}
