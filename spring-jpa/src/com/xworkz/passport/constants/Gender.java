package com.xworkz.passport.constants;

public enum Gender {
	
	MALE('M'),FEMALE('F'),OTHER('O');
	
	private char value;
	
	private Gender(char value) {
		this.value= value;
	}
	public char getValue() {
		return value;
	}

}
