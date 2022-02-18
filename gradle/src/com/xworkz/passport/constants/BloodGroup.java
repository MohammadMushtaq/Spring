package com.xworkz.passport.constants;

public enum BloodGroup {

	A_POSITIVE("a+"),B_POSITIVE("b+"),A_NEGITIVE("a-"),O_POSITIVE("o+"),O_NEGIVATE("o-"),
	AB_NEGITIVE("ab-"),AB_POSITIVE("ab+");
	
	private String value;
	
	private BloodGroup(String value) {
		this.value= value;
	}
	public String getValue() {
		return value;
	}
}
