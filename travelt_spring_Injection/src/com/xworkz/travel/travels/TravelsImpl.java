package com.xworkz.travel.travels;

public class TravelsImpl implements Travels {

	private Travels travels;
	private String name;
	
	
	@Override
	public void booking() {
		System.out.println("invoked booking to kashmir");

	}
	public void setTravels(Travels travels) {
		travels.booking();
		this.travels = travels;
		System.out.println("travels method ");
	}

	public void setName(String name) {
		this.name = name;
		System.out.println("invoked travels name "+name);
	}
	

}
