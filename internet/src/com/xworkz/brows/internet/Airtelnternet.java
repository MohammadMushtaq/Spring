package com.xworkz.brows.internet;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;


@Component
public class Airtelnternet implements Internet {

@Value (value="airtel")
 private String vendor;
@Value (value="870")
 private double costPerMonth;
	
// public Airtelnternet(String vendor,double costPerMonth) {
//	this.vendor=vendor;
//	this.costPerMonth=costPerMonth;
//	
//}
	
	@Override
	public void connect() {
		this.vendor=vendor;
		this.costPerMonth=costPerMonth;
		System.out.println("connected using airtel internet");
		System.out.println("vendor"+this.vendor);
		System.out.println("cost "+this.costPerMonth);

	}

}
