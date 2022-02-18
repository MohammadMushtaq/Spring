package com.xworkz.ipl.service;

import java.time.LocalDate;

import com.xworkz.ipl.entity.IplEntity;
import com.xworkz.ipl.repository.IplRepository;

public class IplServiceImpl implements IplService{

	private IplRepository iplRepository;
	
	public IplServiceImpl(IplRepository iplRepository) {
		this.iplRepository=iplRepository;
	}
	
	@Override
	public boolean saveAndValidate(IplEntity iplEntity) {
		
	boolean valid= true;
	
	if(iplEntity.getTeamName()!=null && iplEntity.getTeamName().length()>5) {
		System.out.println("team name "+iplEntity.getTeamName());
		valid=true;
	}
	else {
		System.out.println("invalid name");
		return false;
	}
	if(iplEntity.getOwner()!=null && iplEntity.getOwner().length()>5) {
		System.out.println("team name "+iplEntity.getOwner());
		valid=true;
	}
	else {
		System.out.println("invalid owner");
		return false;
	}
	if(iplEntity.getCaptain()!=null && iplEntity.getCaptain().length()>5) {
		System.out.println("team name "+iplEntity.getCaptain());
		valid=true;
	}
	else {
		System.out.println("invalid captain name");
		return false;
	}
	if(iplEntity.getSponsor()!=null && iplEntity.getSponsor().length()>5) {
		System.out.println("team name "+iplEntity.getSponsor());
		valid=true;
	}
	else {
		System.out.println("invalid getSponsor");
		return false;
	}
	LocalDate now = LocalDate.now();
	if(iplEntity.getEstdate()!=null && iplEntity.getEstdate().isBefore(now)) {
		System.out.println("team name "+iplEntity.getEstdate());
		valid=true;
	}
	else {
		System.out.println("invalid date");
		return false;
	}
	if(iplEntity.getBudget()!=0 && iplEntity.getBudget()>5000) {
		System.out.println("team name "+iplEntity.getEstdate());
		valid=true;
	}
	else {
		System.out.println("invalid date");
		return false ;
	}
	if(valid=true) {
		System.out.println("successfully added in db");
		this.iplRepository.save(iplEntity);
	}
	else {
		System.out.println("some error");
		return false;
	}
	
		
		
		
		
		return false;
	}

}
