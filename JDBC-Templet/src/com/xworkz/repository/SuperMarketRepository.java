package com.xworkz.repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import com.mysql.cj.xdevapi.Result;
import com.xworkz.enitity.SuperMarket;

@Component
public class SuperMarketRepository {
	
	private JdbcTemplate jdbcTemplate;
	
public SuperMarketRepository(JdbcTemplate jdbcTemplate) {
	this.jdbcTemplate=jdbcTemplate;
}

	public int save(SuperMarket superMarket) {
			String sql = "insert into supermarket values(?,?,?,?,?)";
			 
		return jdbcTemplate.update(sql,superMarket.getId() ,superMarket.getName(),superMarket.getLocation(),
					 superMarket.getEmployees(),superMarket.getBranch()); 
			
	}
	
	public SuperMarket updateById(SuperMarket superMarket) {
	
		String sql= "update supermarket set location =? "+"where id=?";
			
		jdbcTemplate.update(superMarket.getLocation());
		
		if(sql != null){
		      System.out.println("supermarket data updated for ID " +superMarket.getLocation());
		    }else{
		      System.out.println("No supermarket found with ID " + superMarket.getLocation());
		    }      
		
		return null;
	
		
	}

	public SuperMarket displayAll() {
		
			String sql = "select*from supermarket";
			
			int result= jdbcTemplate.update(sql);
			
		
				System.out.println(result);
				return null;
		
		

	}
	public void deleteById(int id) {

			
			String sql = "delete from supermarket where id=?";
			
			jdbcTemplate.update(sql, id);
			
			if(sql!=null) {
				System.out.println(" deleted"+id); 
			}else {
				System.out.println(" not found"+id);
			}
			
		return ;
	}


	
	
}
