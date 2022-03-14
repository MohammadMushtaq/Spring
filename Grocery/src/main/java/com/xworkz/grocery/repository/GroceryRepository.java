package com.xworkz.grocery.repository;

import java.util.List;

import com.xworkz.grocery.entity.GroceryEntity;

public interface GroceryRepository {

	public void save(GroceryEntity groceryEntity);

	default GroceryEntity findByName(String name) {
		return null;
	}

	default GroceryEntity updateByName(GroceryEntity groceryEntity) {
		return null;
	}
	default List<GroceryEntity> getAllGrocery(){
		return null;
		
	}
	
	default boolean deleteGroceryByName(String name) {
		return false;
		
	}

}
