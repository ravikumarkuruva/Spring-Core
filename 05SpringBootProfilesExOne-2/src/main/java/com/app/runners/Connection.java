package com.app.runners;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import lombok.Data;

@Component
@Data
@ConfigurationProperties("my.app")
public class Connection {
	private String driver;
	private String url;
	private String uname;
	private String pword;
}
