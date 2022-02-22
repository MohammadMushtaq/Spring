package com.xworkz;

import com.xworkz.enitity.SuperMarket;
import com.xworkz.repository.SuperMarketRepository;

public class SuperMarketScanner {

	public static void main(String[] args) {
		SuperMarket s = new SuperMarket(1, "ravi", "btm", 15, 2);
		SuperMarket s1 = new SuperMarket(2, "manu", "jai nagar", 5, 3);
		
		SuperMarketRepository sup= new SuperMarketRepository();
		sup.save(s);
		sup.save(s1);
	//	sup.updateById();)

	//	sup.displayById(1);
		
	//	sup.deleteById(1);
	}

}
