package com.xworkz.grocery.service;

import java.util.List;

import com.xworkz.grocery.dto.GroceryDTO;
import com.xworkz.grocery.entity.GroceryEntity;

public interface GroceryService {

	boolean validateAndSave(GroceryEntity groceryEntity);
	
	default GroceryDTO validateAndFindByName(String  name) {
		return null;
	
	}
	default GroceryDTO validateAndUpdateByName(String name, int quantity, double price, String type, String brand) {
		return null;
	}
	default List<Object> getAllNewspapaer(){
		return null;
		
	}
	default boolean deleteGrocery(String name) {
		
		return false;
		
	}
		
}
