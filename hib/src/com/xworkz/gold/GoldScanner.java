package com.xworkz.gold;

import com.xworkz.gold.dao.GoldDAO;
import com.xworkz.gold.dao.GoldDAOImpl;
import com.xworkz.gold.util.GoldEntity;

public class GoldScanner {

	public static void main(String[] args) {
		GoldEntity gold1 = new GoldEntity(1,24d,5d,95,true,50000d);
		GoldEntity gold2 = new GoldEntity(2,12d,6d,75,false,40000d);
		GoldEntity gold3 = new GoldEntity(3,18d,7d,80,true,48000d);
		GoldEntity gold4 = new GoldEntity(4,20d,8d,85,true,49000d);
		
		GoldDAO gold = new GoldDAOImpl();
//		gold.save(gold1);
//		gold.save(gold2);
//		gold.save(gold3);
//		gold.save(gold4);
		
	//	gold.getAll();
		gold.getPriceGreaterThan(45000d);
	}

}
