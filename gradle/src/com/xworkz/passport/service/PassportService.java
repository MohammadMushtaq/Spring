package com.xworkz.passport.service;

import com.xworkz.passport.entity.PassportEntity;

public interface PassportService {
	
	boolean validateAndSave(PassportEntity entity);

}
