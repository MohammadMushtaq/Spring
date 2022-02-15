package com.xworkz.passport.service;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.xworkz.passport.constants.PassportPersonnelType;
import com.xworkz.passport.entity.PassportEntity;
import com.xworkz.passport.reposistry.PassportDAO;

public class PassportServiceImp implements PassportService{

	PassportDAO passportDAO;
	
	@Override
	public boolean validateAndSave(PassportEntity entity) {
	boolean valid=false;
		
		try {
			if(entity.getIssuedBy()!=null && entity.getIssuedBy().length()>3 && entity.getIssuedBy().length()<135) {
				valid=true;
			}else {
				System.err.println("invalid name ");
				System.err.println("chararcter >3&<135");
				return valid;
			}
			if(entity.getIssuedAt()!=null ) {
				valid=true;
			}else {
				System.err.println("invalid date ");
				return valid;
			}
			
			if(entity.getPassportPersonnelType().equals(PassportPersonnelType.REGULAR))
			{
				if(entity.getExpiresAt()!=null && entity.getExpiresAt().isAfter(entity.getIssuedAt().plusYears(10))) 
				{
				valid=true;
				}
				else {
					System.err.println("expired");
				return valid;
				}	
			}
			else if(entity.getPassportPersonnelType().equals(PassportPersonnelType.DEPLOMATIC)){ 
				if(entity.getExpiresAt()!=null && entity.getExpiresAt().isAfter(entity.getIssuedAt().plusYears(5))) 
				{
				valid=true;
				}
				else 
				{
				System.err.println("expired");
				return valid;
				}
			}
			
			
			if(entity.getPassportNo()!=null && entity.getPassportNo().length()==8) {
				
				  String regex = "^[A-PR-WYa-pr-wy][1-9]\\d"
	                       + "\\s?\\d{4}[1-9]$";
				  Pattern p = Pattern.compile(regex);
				  
				  Matcher m = p.matcher(entity.getPassportNo());
			
				  valid = true;
				//  return m.matches();  
				
				  
			}else {
				System.err.println("passport is invalid");
				return valid;
			}
			if(entity.getAddress()!=null && entity.getAddress().length()>10 && entity.getAddress().length()<200) {
				valid= true;
			}else {
				System.err.println("address is invalid");
				return valid;
			}
			if(entity.getFullName()!=null && entity.getFullName().length()>10 && entity.getFullName().length()<200) {
				valid= true;
			}else {
				System.err.println("invalid name");
				return false;
			}
			if(entity.isLegalIssue()==false) {
				valid= true;
			}else {
				System.err.println("invalid");
				return false;
			}
			if(entity.getDob()!=null && entity.getDob().isBefore(LocalDateTime.now())) {
				valid= true;
			}else {
				System.err.println("invalid");
				return false;
			}
			
			passportDAO.save(entity);
			
			
			} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		return false;
		}

	}
