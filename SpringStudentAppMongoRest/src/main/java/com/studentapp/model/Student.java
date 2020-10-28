package com.studentapp.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.TypeAlias;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "student")
@TypeAlias("Student")

public class Student {
	
	@Id
	int stuId;
	String name;
	String dept;
	int age;
	
	@Autowired
	Address address;
	
	
    
	public Student(int stuId, String name, String dept, int age, Address address) {
		super();
		this.stuId = stuId;
		this.name = name;
		this.dept = dept;
		this.age = age;
		this.address = address;
	}

	public int getStuId() {
		return stuId;
	}

	public void setStuId(int stuId) {
		this.stuId = stuId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	
	@Override
	public String toString() {
		return "Student [stuId=" + stuId + ", name=" + name + ", dept=" + dept + ", age=" + age + ", address=" + address
				+ "]";
	}

}
