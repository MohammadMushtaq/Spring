package com.xworkz.address;

import org.springframework.beans.factory.annotation.Value;

public abstract class AbstractAddress {

	public String street;
	public int doorNo;
	public String city;
	
	

	public abstract void setStreet(String street);

	public abstract void setDoorNo(int doorNo);

	public abstract void setCity(String city);
	

}
