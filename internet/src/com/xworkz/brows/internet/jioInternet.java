package com.xworkz.brows.internet;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Configuration
@Component
public class jioInternet implements Internet {
@Autowired
@Value (value="jio")
	 private String vendor;
@Value (value="780rs")
	 private double costPerMonth;
	
	public jioInternet() {
		this.vendor=vendor;
		this.costPerMonth=costPerMonth;
		System.out.println("vendor "+this.vendor);
		System.out.println("cost "+this.costPerMonth);
	}
	
	@Override
	public void connect() {
	System.out.println("connected using jio internet");

	}

}
