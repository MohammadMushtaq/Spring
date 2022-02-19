package com.xworkz.add;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;
import org.springframework.stereotype.Component;

import com.xworkz.address.AbstractAddress;
import com.xworkz.address.Address;

//@Component
public class HomeAddress extends AbstractAddress implements Address {

	@Override
	@Value("mg road")
	public void setStreet(String street) {
		//System.out.println(super.street);
	}

	@Override
	@Value("120")
	public void setDoorNo(int doorNo) {

	}

	@Override
	@Value("bangalore")
	public void setCity(String city) {

	}

	@Override
	public void displayDeatils() {

		System.out.println(this.street);
		System.out.println(this.doorNo);
		System.out.println(this.city);

	}
}
