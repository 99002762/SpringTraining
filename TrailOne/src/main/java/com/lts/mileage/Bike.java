package com.lts.mileage;

import org.springframework.stereotype.Component;

@Component
public class Bike implements MileCalculator {

	@Override
	public void showMileage() {
		// TODO Auto-generated method stub
		System.out.println("Bike Mileage is " + 50);

	}

}
