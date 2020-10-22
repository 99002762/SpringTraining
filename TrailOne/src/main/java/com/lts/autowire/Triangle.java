package com.lts.autowire;

import org.springframework.stereotype.Component;

@Component("tshape")
public class Triangle implements Shape {
	
	@Override
	public void calculateArea(int x, int y) {
		// TODO Auto-generated method stub
		System.out.println("triangle "+0.5*x*y);

	}

}
