package com.xworkz.brows.internet;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Configuration
@Component
public class Airtelnternet implements Internet {
@Autowired

 private String vendor;
 private double costPerMonth;
	
 public Airtelnternet(String vendor,double costPerMonth) {
	this.vendor=vendor;
	this.costPerMonth=costPerMonth;
	System.out.println("vendor"+this.vendor);
	System.out.println("cost "+this.costPerMonth);
}
	
	@Override
	public void connect() {
		System.out.println("connected using airtel internet");

	}

}
