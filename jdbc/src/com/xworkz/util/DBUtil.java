package com.xworkz.util;

import java.sql.Connection;
import java.sql.DriverManager;

import javax.sql.PooledConnection;

import com.xworkz.db.DBConstants;

public class DBUtil {

	private static Connection connection=null;
	
	public static Connection getConnection() {
		if(connection==null) {
			try {
				connection= DriverManager.getConnection(DBConstants.MY_URL,DBConstants.USERNAME,DBConstants.PASSWORD);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return connection;
	}
	
	public static Connection mysql(PooledConnection pooledConnection) {
		
		return connection;
		
		
	}
	
	
	
}
