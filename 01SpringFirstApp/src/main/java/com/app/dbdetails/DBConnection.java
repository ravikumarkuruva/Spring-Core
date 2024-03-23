package com.app.dbdetails;

import org.springframework.stereotype.Component;

@Component("dbcon")
public class DBConnection {
	private String url;
	private String uname;
	private String pword;
	
	public DBConnection() {
		super();
	}

	public DBConnection(String url, String uname, String pword) {
		super();
		this.url = url;
		this.uname = uname;
		this.pword = pword;
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
		return "DBConnection [url=" + url + ", uname=" + uname + ", pword=" + pword + "]";
	}
	
	
	
	
}
