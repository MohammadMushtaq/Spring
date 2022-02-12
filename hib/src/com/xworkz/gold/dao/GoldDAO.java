package com.xworkz.gold.dao;

import com.xworkz.gold.util.GoldEntity;

public interface GoldDAO {

	void save(GoldEntity gold);
	
	void getAll();
	GoldEntity getPriceGreaterThan(double price);
	
	
}
