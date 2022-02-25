package com.xworkz.repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.xworkz.db.DBConstants;
import com.xworkz.enitity.SuperMarket;
import com.xworkz.util.DBUtil;

public class SuperMarketRepository {
	
	Connection mysql;

	public boolean save(SuperMarket superMarket) {

		try {

			// DBUtil.connectingmysql();
			mysql = DriverManager.getConnection(DBConstants.MY_URL, DBConstants.USERNAME, DBConstants.PASSWORD);
			if(!mysql.isClosed()) {
			// String sql="insert into city_details
			// values("+citDto.getId()+",'"+citDto.getName()+"',"+citDto.getPopulation()+",'"+citDto.getFamousFor()+"')";
			String sql = "insert into supermarket values(?,?,?,?,?)";
			PreparedStatement preparedStatement = mysql.prepareStatement(sql);
			preparedStatement.setObject(1, superMarket.getId());
			preparedStatement.setObject(2, superMarket.getName());
			preparedStatement.setObject(3, superMarket.getLocation());
			preparedStatement.setObject(4, superMarket.getEmployees());
			preparedStatement.setObject(5, superMarket.getBranch());
			

			int rowEffected = preparedStatement.executeUpdate();
			System.out.println(rowEffected);
			if (rowEffected == 1)
				return true;
			}
		} catch (SQLException e) {

			e.printStackTrace();
		} finally {
			try {
				if (mysql.isClosed());
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return false;
	}
	
	public SuperMarket updateById() {
		
		mysql=DBUtil.getConnection();
		try {
		String sql= "update supermarket set location =? "+"where id=?";
			
	PreparedStatement preparedStatement= mysql.prepareStatement(sql);
	
		preparedStatement.setString(1, "ram");
		preparedStatement.setInt(1, 2);
		
		int a=preparedStatement.executeUpdate();
		System.out.println(a);
		
	} catch (SQLException e) {
		
		e.printStackTrace();
	}
		return null;
	
		
	}
	public boolean displayById(int id) {

		try {
		 mysql = DriverManager.getConnection(DBConstants.MY_URL, DBConstants.USERNAME,
					DBConstants.PASSWORD);

			String sql = "select*from supermarket where id=" + id;
			PreparedStatement stmt = mysql.prepareStatement(sql);
			ResultSet result = stmt.executeQuery();
			if (result.next()) {
				Object obj1 = result.getObject(1);
				System.out.println(obj1);
				Object obj2 = result.getObject(2);
				System.out.println(obj2);
				Object obj3 = result.getObject(3);
				System.out.println(obj3);
				Object obj4 = result.getObject(4);
				System.out.println(obj4);

			}
			return true;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}
	public boolean displayAll() {

		try {
		 mysql = DriverManager.getConnection(DBConstants.MY_URL, DBConstants.USERNAME,
					DBConstants.PASSWORD);
			// DBUtil.connectingmysql();
			String sql = "select*from supermarket";
			PreparedStatement stmt = mysql.prepareStatement(sql);
			ResultSet result = stmt.executeQuery();
			while (result.next()) {
				Object obj1 = result.getObject(1);
				System.out.println(obj1);
				Object obj2 = result.getObject(2);
				System.out.println(obj2);
				Object obj3 = result.getObject(3);
				System.out.println(obj3);
				Object obj4 = result.getObject(4);
				System.out.println(obj4);

			}
			return true;
		} catch (SQLException e) {

			e.printStackTrace();
		}
		return false;

	}
	public boolean deleteById(int id) {
		try {

			 mysql = DriverManager.getConnection(DBConstants.MY_URL, DBConstants.USERNAME,
					DBConstants.PASSWORD);
			
			String sql = "delete from supermarket where id=" + id;
			
			 PreparedStatement statement = mysql.prepareStatement(sql);
			int rowDelete = statement.executeUpdate(sql);
			 if(rowDelete > 0) return true;
		//	 System.out.println(rowDelete);
			 System.out.println("deleted");
			return true;
		} catch (SQLException e) {
			System.out.println("wrong");
			e.printStackTrace();
		}
		return false;
	}


	
	
}
