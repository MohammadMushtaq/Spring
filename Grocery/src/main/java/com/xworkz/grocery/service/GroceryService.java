package com.xworkz.grocery.service;

import com.xworkz.grocery.dto.GroceryDTO;
import com.xworkz.grocery.entity.GroceryEntity;

public interface GroceryService {

	boolean validateAndSave(GroceryEntity groceryEntity);
	
	default GroceryDTO validateAndFindByName(String  name) {
		return null;
		
		
	}
}
