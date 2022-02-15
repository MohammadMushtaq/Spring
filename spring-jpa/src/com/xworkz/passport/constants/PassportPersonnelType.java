package com.xworkz.passport.constants;

public enum PassportPersonnelType {

	REGULAR('R'), DEPLOMATIC('D');
	
	private char value;
	
	private PassportPersonnelType(char value) {
		this.value=value;
	}
	public char getValue() {
		return value;
	}
}
