package com.xworkz.ecommerce;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import com.xworkz.address.Address;

@Component
public class EcommerceImpl implements Ecommerce {

	@Value("filpkart")
	private String regisiterOffice;
	@Value("100")
	private int noOfEmployees; 
	
//	@Autowired
//	@Qualifier("homeAddress")
//	private Address address;
	
	@Autowired
	@Qualifier("officeAddress")
	private Address address1;
	
	
	@Override
	public void orderItem(String item) {
		
		System.out.println("order item is "+this.address1);
	}

	@Override
	public void cancelItem(String item) {
		System.out.println("cancel item "+this.address1);

	}

}
