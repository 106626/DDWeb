package com.cx.util;

import java.sql.Connection;
import java.sql.SQLException;

import org.apache.commons.dbcp.BasicDataSource;

public class SimpleDataSource {

	private static SimpleDataSource instance = new SimpleDataSource();
	private static BasicDataSource bds = new BasicDataSource();
	
	static{
		ConnectionFactoty cf = ConnectionFactoty.getInstance();
		
		bds.setDriverClassName(cf.getValue("driver"));
		bds.setUrl(cf.getValue("url"));
		bds.setUsername(cf.getValue("user"));
		bds.setPassword(cf.getValue("password"));
	
		bds.setInitialSize(Integer.valueOf(cf.getValue("initialSize")));
		bds.setMaxActive(Integer.valueOf(cf.getValue("maxActive")));
		bds.setMaxIdle(Integer.valueOf(cf.getValue("maxIdle")));
		bds.setMaxWait(Long.valueOf(cf.getValue("maxWait")));
		
	}
	public static SimpleDataSource getInstatnce(){
		return instance;
	}
	public Connection getConnection() throws SQLException{
		return bds==null?null:bds.getConnection();
	}
}
