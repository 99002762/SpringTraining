package com.lts.autowire;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ShapeFactory {
	
	@Autowired
	//@Qualifier("rectangle")
	Shape shape;
	@Autowired
	//@Qualifier("triangle")
	Shape tshape;
	
	public void printArea(int x, int y) {
		
		shape.calculateArea(x, y);
		tshape.calculateArea(x, y);
	}

}
