package com.xworkz.customer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import com.xworkz.address.Address;
import com.xworkz.ecommerce.Ecommerce;

@Component
public class Customer {

	@Value("anil")
	private String name;
	@Autowired
	private Address address;
	@Autowired
	private Ecommerce ecommerce;
	
	public void order(String item) {
		this.address.displayDeatils();
		this.ecommerce.orderItem(item);
	}
}
