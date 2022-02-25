package com.xworkz.samsung.repository;

import java.util.List;

import com.xworkz.samsung.entity.SamsungEntity;

public interface SamsungRepository {
	
		List<SamsungEntity> save(SamsungEntity samsungEntity);
		
		String createdBy();
		
		void deleted();
		
		
		
		

}
