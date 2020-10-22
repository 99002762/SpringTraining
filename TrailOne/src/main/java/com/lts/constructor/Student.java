package com.lts.constructor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
@Component
public class Student {
	
	String stuName;
	Integer stuId;
	String stuDept;
	//@Autowired
	Course course;
	
	
	@Autowired
	public Student(Course course) {
		super();
		this.course = course;
	}
	
	public String getStuName() {
		return stuName;
	}
	@Value("${student.stuName}")
	public void setStuName(String stuName) {
		this.stuName = stuName;
	}
	public Integer getStuId() {
		return stuId;
	}
	@Value("${student.stuId}")
	public void setStuId(Integer stuId) {
		this.stuId = stuId;
	}
	public String getStuDept() {
		return stuDept;
	}
	@Value("${student.stuDept}")
	public void setStuDept(String stuDept) {
		this.stuDept = stuDept;
	}
	@Override
	public String toString() {
		return "Student [stuName=" + stuName + ", stuId=" + stuId + ", stuDept=" + stuDept + ", course=" + course + "]";
	}

}
