package com.xworkz.grocery.repository;

import com.xworkz.grocery.entity.GroceryEntity;

public interface GroceryRepository {

	void save(GroceryEntity groceryEntity);
	
	default GroceryEntity findByName(String name) {
		return null;
	}
	default GroceryEntity updateByName(String name,int quantity,double price,String type,String brand) {
		return null;
	}

}
