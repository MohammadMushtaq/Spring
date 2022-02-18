package com.xworkz.ipl.entity;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
@Entity
@Table (name="ipltable")
public class IplEntity {
@Id
	@Column (name="id")
	private int id;
	@Column (name="teamName")
	private String teamName;
	@Column (name="teamowner")
	private String owner;
	@Column (name="teamcaptain")
	private String captain;
	@Column (name="teamsponsor")
	private String sponsor;
	@Column (name="borndate")
	private LocalDate estdate;
	@Column (name="budget")
	private double budget;
	
	
	public IplEntity(String teamName, String owner, String captain, String sponsor, LocalDate estdate, double budget) {
		super();
		this.teamName = teamName;
		this.owner = owner;
		this.captain = captain;
		this.sponsor = sponsor;
		this.estdate = estdate;
		this.budget = budget;
	}
	
	

}
