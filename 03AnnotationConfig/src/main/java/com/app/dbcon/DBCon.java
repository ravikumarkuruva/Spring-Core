package com.app.dbcon;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("dbcon")
public class DBCon {
	@Value("jdbc:oracle:thin:@localhost:1521:orcl")
	private String url;
	@Value("ravi")
	private String uname;
	@Value("ravi")
	private String pword;
	@Override
	public String toString() {
		return "DBCon [url=" + url + ", uname=" + uname + ", pword=" + pword + "]";
	}
	
}
