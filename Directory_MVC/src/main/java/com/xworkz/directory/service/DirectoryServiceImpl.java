package com.xworkz.directory.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.xworkz.directory.Entity.DirectoryEntity;
import com.xworkz.directory.repository.DirectoryRepository;

@Component
public class DirectoryServiceImpl implements DirectoryService {
	
	private DirectoryRepository directoryRepository;
	
	public DirectoryServiceImpl(DirectoryRepository directoryRepository) {
		this.directoryRepository=directoryRepository;
		System.out.println("invoked service");
	}
	
	@Override
	public boolean validateAndSave(DirectoryEntity entity) {
		boolean valid = true;

		if (entity.getAddress() != null && !(entity.getAddress().isEmpty()) && entity.getAddress().length() > 3
				&& entity.getAddress().length() < 200) {
			valid = true;
		} else {
			System.out.println("Invalid Address");
			valid = false;
			return valid;
		}
		if (entity.getLandlineNum() != 0) {
			valid = true;
		} else {
			System.out.println("Invalid Landline Number");
			valid = false;
			return valid;
		}
		if (entity.getLandmark() != null && !(entity.getLandmark().isEmpty()) && entity.getLandmark().length() > 4
				&& entity.getLandmark().length() < 200) {
			valid = true;
		} else {
			System.out.println("Invalid Landmark");
			valid = false;
			return valid;
		}
		if (entity.getName() != null && !(entity.getName().isEmpty()) && entity.getName().length() > 4
				&& entity.getName().length() < 200) {
			valid = true;
		} else {
			System.out.println("Invalid Name");
			valid = false;
			return valid;
		}
		//String.valueOf(entity.getMobileNo()).length()==10
		if (entity.getMobileNo()!=0) {
			valid = true;
		} else {
			System.out.println("Invalid Mobile no");
			valid = false;
			return valid;
		}
		
		if (valid) {
			directoryRepository.save(entity);
			valid=true;
		}

		return false;
	}
		
}