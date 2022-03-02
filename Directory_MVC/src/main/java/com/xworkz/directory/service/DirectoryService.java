package com.xworkz.directory.service;

import com.xworkz.directory.Entity.DirectoryEntity;

public interface DirectoryService {

	boolean validateAndSave(DirectoryEntity directoryEntity);
}
