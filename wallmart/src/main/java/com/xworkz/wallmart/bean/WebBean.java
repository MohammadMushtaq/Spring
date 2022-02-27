package com.xworkz.wallmart.bean;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Component
@RequestMapping("/")
public class WebBean {

	public WebBean() {
		System.out.println("invoked web bean");
	}
	
	@RequestMapping("click.do")
public String enter(@RequestParam String name,@RequestParam String email,@RequestParam long mobile,@RequestParam int age  ) {
	
	System.out.println(name);
	System.out.println(email);
	System.out.println(mobile);
	System.out.println(age);
	
	return "/first.html";
} 	



@RequestMapping("gov.do")
public String governmentDetail(@RequestParam("style") String name,@RequestParam("style1") String partyname
		,@RequestParam String cmname,@RequestParam String governorname,
		@RequestParam String Dycmname) {
	
	System.out.println(name);
	System.out.println(partyname);
	System.out.println(cmname);
	System.out.println(governorname);
	System.out.println(Dycmname);
	
	return "/gov.html";
	
	
}	
}
