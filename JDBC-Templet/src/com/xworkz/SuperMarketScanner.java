package com.xworkz;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import com.xworkz.enitity.SuperMarket;
import com.xworkz.repository.SuperMarketRepository;

public class SuperMarketScanner {

	public static void main(String[] args) {
		
		
		ApplicationContext container= new ClassPathXmlApplicationContext("spring.xml");
		
		
		SuperMarketRepository sup= container.getBean(SuperMarketRepository.class);
		
//		SuperMarket s = new SuperMarket(1, "ravi", "btm", 15, 2);
//		SuperMarket s1 = new SuperMarket(2, "manu", "jai nagar", 5, 3);
//		SuperMarket s2 = new SuperMarket(3, "manu", "jai nagar", 5, 3);
//		SuperMarket s3 = new SuperMarket(4, "manu", "jai nagar", 5, 3);
		
		
		SuperMarket rep= new SuperMarket();
		rep.setName("sunil");
		rep.setId(3);
		rep.setLocation("rajajai");
		rep.setEmployees(45);
		rep.setBranch(2);
		
//	int s=	sup.save(rep);
//	System.out.println(s);
		
//		sup.deleteById(1);

		SuperMarket r =sup.displayAll();
		System.out.println(r);
	}

}
