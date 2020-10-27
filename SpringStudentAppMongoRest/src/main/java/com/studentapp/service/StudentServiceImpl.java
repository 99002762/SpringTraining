package com.studentapp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.studentapp.dao.StudentRepository;
import com.studentapp.exceptions.StudentNotFoundException;
import com.studentapp.model.Student;

@Service
public class StudentServiceImpl implements StudentService {
	
    @Autowired
	StudentRepository studentRepository;
	@Override
	public Student addStudent(Student student) {
		Student newStudent = studentRepository.save(student);
		return newStudent;
	}

	@Override
	public Student getStudentById(int id) {
		return studentRepository.findById(id)
				.orElseThrow(()-> new StudentNotFoundException("Id not available") );
	}

	@Override
	public boolean deleteStudent(int id) {
		studentRepository.deleteById(id);
		return true;
	}

}
