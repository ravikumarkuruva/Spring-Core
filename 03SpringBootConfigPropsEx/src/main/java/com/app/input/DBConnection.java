package com.app.input;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties("my.app")
public class DBConnection {
	private String driver;
	
	private String url;
	
	private String uname;

	private String pword;
	
	

	public String getDriver() {
		return driver;
	}



	public void setDriver(String driver) {
		this.driver = driver;
	}



	public String getUrl() {
		return url;
	}



	public void setUrl(String url) {
		this.url = url;
	}



	public String getUname() {
		return uname;
	}



	public void setUname(String uname) {
		this.uname = uname;
	}



	public String getPword() {
		return pword;
	}



	public void setPword(String pword) {
		this.pword = pword;
	}



	@Override
	public String toString() {
		return "DBConnection [driver=" + driver + ", url=" + url + ", uname=" + uname + ", pword=" + pword + "]";
	}
	
	
}
