package com.xworkz.add;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import com.xworkz.address.AbstractAddress;
import com.xworkz.address.Address;

@Component
public class OfficeAddress extends AbstractAddress implements Address {

	
	@Override
	public void displayDeatils() {
		System.out.println(this.street);
		System.out.println(this.doorNo);
		System.out.println(this.city);
		
	}

	@Override
	@Value("${office.street}")
	public void setStreet(String street) {
	
		this.street=street;
	}

	@Override
	@Value("${office.doorNo}")
	public void setDoorNo(int doorNo) {
		this.doorNo=doorNo;
		
	}
	

	@Override
	@Value("${office.city}")
	public void setCity(String city) {
		this.city=city;
		
	}

}
