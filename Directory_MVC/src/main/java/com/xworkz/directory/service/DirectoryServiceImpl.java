package com.xworkz.directory.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.xworkz.directory.DirectoryWebBean;
import com.xworkz.directory.Entity.DirectoryEntity;
import com.xworkz.directory.repository.DirectoryRepository;

@Component
public class DirectoryServiceImpl implements DirectoryService {
	@Autowired
	private DirectoryRepository DirectoryRepository;
	
	public DirectoryServiceImpl(DirectoryRepository directoryRepository) {
		this.DirectoryRepository = directoryRepository;
	}
	
	@Override
	public boolean validateAndSave(DirectoryEntity directoryEntity) {
		boolean valid=false;
		if(directoryEntity.getName()!=null && directoryEntity.getName().length()>3) {
			valid=true;
		}
		else {
			return valid;
		}
		if(directoryEntity.getMobileNo()!=0 && directoryEntity.toString().valueOf(directoryEntity.getMobileNo()).length()==10) {
			valid=true;
		}
		else {
			return valid;
		}
		if(directoryEntity.getAddress()!=null && directoryEntity.getAddress().length()>5) {
			valid=true;
		}
		else {
			return valid;
		}
		if(directoryEntity.getLandlineNum()!=0 && directoryEntity.getLandlineNum()>5) {
			valid=true;
		}
		else {
			return valid;
		}
		if(directoryEntity.getLandmark()!=null && directoryEntity.getLandmark().length()>4) {
			valid=true;
		}
		else {
			return valid;
		}
		
	
			this.DirectoryRepository.save(directoryEntity);
		
		
		return false;
	}

}
