package com.studentapp.service;

import com.studentapp.model.Student;

public interface StudentService {
	
	Student addStudent(Student student);
	Student getStudentById(int id);
	boolean deleteStudent(int id);

}
