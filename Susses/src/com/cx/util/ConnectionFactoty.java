package com.cx.util;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class ConnectionFactoty {
	
	private static final String PATH="config/dbConfig.properties";
	private static Properties prop = null;
	private static ConnectionFactoty instance = new ConnectionFactoty();
	private ConnectionFactoty(){
		prop = new Properties();
		InputStream in = Thread.currentThread()
							.getContextClassLoader().getResourceAsStream(PATH);
		//����
		try {
			prop.load(in);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public String getValue(String key){
		return prop==null?null:prop.getProperty(key);
	}
	public static ConnectionFactoty getInstance(){
		return instance;
	}
	public static void main(String[] args) {
		System.out.println(ConnectionFactoty.getInstance().getValue("driver"));
	}
}
