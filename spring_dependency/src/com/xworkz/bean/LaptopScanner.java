package com.xworkz.bean;

import com.xworkz.bean.spring.Camera;
import com.xworkz.bean.spring.Laptop;


public class LaptopScanner {

	public static void main(String[] args) {
		
		
		Camera camera= new Camera();

		Laptop lap= new Laptop();
		lap.setBrand("kodak");
		lap.setCamera(camera);
		
		

	}

}
