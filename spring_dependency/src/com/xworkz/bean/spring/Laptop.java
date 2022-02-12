package com.xworkz.bean.spring;

public class Laptop {
	private String brand;
	private Camera camera;
	

	public Laptop() {
		System.out.println("invoked laptop no args");
	}
	public void setBrand(String brand) {
		this.brand = brand;
		System.out.println("invoked setbrand method");
	}	
	
		public void setCamera(Camera camera) {
			this.camera = camera;
			
			if(camera!=null) {
				camera.captureImage();
				System.out.println("invoked camera of brand "+brand);
			}else {
				
				System.err.println("camera is not working");
			}
		}
	}	


