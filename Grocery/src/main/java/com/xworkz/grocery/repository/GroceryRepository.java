package com.xworkz.grocery.repository;

import com.xworkz.grocery.entity.GroceryEntity;

public interface GroceryRepository {

	public void save(GroceryEntity groceryEntity);

	default GroceryEntity findByName(String name) {
		return null;
	}

	default GroceryEntity updateByName(GroceryEntity groceryEntity) {
		return null;
	}

}
