package com.cx.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcUtil {
	private static String driver = ConnectionFactoty.getInstance().getValue("driver");
	private static String url = ConnectionFactoty.getInstance().getValue("url");
	private static String user = ConnectionFactoty.getInstance().getValue("user");
	private static String password = ConnectionFactoty.getInstance().getValue("password");
	

	public static Connection getConnection() throws SQLException{
		Connection conn = null;
		try {
			Class.forName(driver);
			conn = DriverManager.getConnection(url, user, password);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return conn;
	}
	public static void reLease(Connection conn,Statement st,ResultSet rs){
		if(null!=rs){
			try {
				rs.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		if(null!=st){
			try {
				st.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		if(null!=conn){
			try {
				conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
