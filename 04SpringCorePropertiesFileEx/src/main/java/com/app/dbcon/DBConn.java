package com.app.dbcon;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("dbcon")
public class DBConn {
	@Value("${my.app.driver}")
	private String driver;
	@Value("${my.app.url}")
	private String url;
	@Value("${my.app.uname}")
	private String uname;
	@Value("${my.app.pword}")
	private String pword;
	@Override
	public String toString() {
		return "DBConn [driver=" + driver + ", url=" + url + ", uname=" + uname + ", pword=" + pword + "]";
	}
	
	
}
