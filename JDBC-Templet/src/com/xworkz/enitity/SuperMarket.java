package com.xworkz.enitity;

public class SuperMarket {
	
	private int id;
	private String name;
	private String location;
	private int employees;
	private int branch;
	
	public SuperMarket() {
		// TODO Auto-generated constructor stub
	}

	public SuperMarket(int id, String name, String location, int employees, int branch) {
		super();
		this.id = id;
		this.name = name;
		this.location = location;
		this.employees = employees;
		this.branch = branch;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public int getEmployees() {
		return employees;
	}

	public void setEmployees(int employees) {
		this.employees = employees;
	}

	public int getBranch() {
		return branch;
	}

	public void setBranch(int branch) {
		this.branch = branch;
	}

	@Override
	public String toString() {
		return "SuperMarket [id=" + id + ", name=" + name + ", location=" + location + ", employees=" + employees
				+ ", branch=" + branch + "]";
	} 
	
}
