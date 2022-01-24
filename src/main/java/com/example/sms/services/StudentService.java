package com.example.sms.services;

import java.util.List;

import com.example.sms.entity.Student;

import javax.persistence.StoredProcedureQuery;

public interface StudentService {
	
	List<Student> getAllStudents();
	
	Student saveStudent(Student student);
	
	
	Student getStudentById(Long id);
	
	Student updateStudent(Student student);
	
	void deleteStudentById(Long id);

	public boolean getFourStudents();
}
