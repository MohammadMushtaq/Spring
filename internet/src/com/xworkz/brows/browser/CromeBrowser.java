package com.xworkz.brows.browser;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import com.xworkz.brows.internet.Internet;


@Component
public class CromeBrowser implements Browser {

	@Value (value="crome")
	private String name;
	@Value (value="7.25")
	private String version;
	@Autowired
	private Internet internet;
	
	@Override
	public void surf() {
		
		this.internet.connect();
		System.out.println(this.name+" browser name");
		System.out.println(this.version+" crome version");
		
	}

}
