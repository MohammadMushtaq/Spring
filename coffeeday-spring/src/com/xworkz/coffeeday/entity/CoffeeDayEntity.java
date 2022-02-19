package com.xworkz.coffeeday.entity;

import java.time.LocalDate;
import java.time.LocalTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Entity
@Table (name="coffeeday")

public class CoffeeDayEntity {
@Id
@Column (name="c_id")
	private int id;
@Column (name="c_location")
	private String location;
@Column (name="c_owner")
	private String owner;
@Column (name="c_startdate")
	private LocalDate startedDate;
@Column (name="c_opentime")
	private LocalTime openTime;
@Column (name="c_closetime")
	private LocalTime closeTime;
public CoffeeDayEntity(String location, String owner, LocalDate startedDate, LocalTime openTime, LocalTime closeTime) {
	super();
	this.location = location;
	this.owner = owner;
	this.startedDate = startedDate;
	this.openTime = openTime;
	this.closeTime = closeTime;
}


	
}
