package com.xworkz.directory.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Entity 
@Table (name="directory")
public class DirectoryEntity {
@Id
@Column(name="d_id")
@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
@Column(name="d_name")
	private String name;
@Column(name="d_mobileno")
	private double mobileNo;
@Column(name="d_Address")
	private String address;
@Column(name="d_landmark")
	private String landmark;
@Column(name="d_landlineno")
	private double landlineNum;
@Column(name="d_city")
	private String city;
@Column(name="d_pincode")
	private String pincode;

public DirectoryEntity(String name, double mobileNo, String address, String landmark, double landlineNum, String city,
		String pincode) {
	super();
	this.name = name;
	this.mobileNo = mobileNo;
	this.address = address;
	this.landmark = landmark;
	this.landlineNum = landlineNum;
	this.city = city;
	this.pincode = pincode;
}



}


