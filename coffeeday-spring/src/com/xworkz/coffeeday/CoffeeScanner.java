package com.xworkz.coffeeday;

import java.time.LocalDate;
import java.time.LocalTime;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.xworkz.coffeeday.entity.CoffeeDayEntity;
import com.xworkz.coffeeday.service.CoffeeDayService;

public class CoffeeScanner {

	public static void main(String[] args) {
		
		CoffeeDayEntity coffee= new CoffeeDayEntity("btm water tank","mahesh",
				LocalDate.of(2020, 4, 1),LocalTime.of(9, 20),LocalTime.of(6, 00));

		ApplicationContext container= new ClassPathXmlApplicationContext("spring.xml");
		CoffeeDayService coffeeDayService= container.getBean(CoffeeDayService.class);
		coffeeDayService.saveAndValidate(coffee);
		
	}

}
