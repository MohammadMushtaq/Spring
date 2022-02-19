package com.xworkz.coffeeday.service;

import com.xworkz.coffeeday.entity.CoffeeDayEntity;

public interface CoffeeDayService {

	boolean saveAndValidate(CoffeeDayEntity entity);
}
