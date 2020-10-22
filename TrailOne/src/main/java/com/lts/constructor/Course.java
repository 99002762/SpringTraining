package com.lts.constructor;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Course {
  
	String crsName;
	Integer price;
	
	public String getCrsName() {
		return crsName;
	}
	@Value("${student.course.crsName}")
	public void setCrsName(String crsName) {
		this.crsName = crsName;
	}
	public Integer getPrice() {
		return price;
	}
	@Value("${student.course.price}")
	public void setPrice(Integer price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Course [crsName=" + crsName + ", price=" + price + "]";
	}
	
}
