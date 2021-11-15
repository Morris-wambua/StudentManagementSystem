package com.example.sms.services.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.sms.entity.Student;
import com.example.sms.repositories.StudentRepository;
import com.example.sms.services.StudentService;

@Service
public class StudentServiceImpl implements StudentService{
	
	//Inject the StudentRepo..Not we used constructor-based injection
	private StudentRepository studentRepository;
	
	//This is only one bean so no need for @autowired
	public StudentServiceImpl(StudentRepository studentRepository) {
		super();
		this.studentRepository = studentRepository;
	}

	@Override
	public List<Student> getAllStudents() {

		return studentRepository.findAll();
	}
	
	@Override
	public Student saveStudent(Student student) {
		return studentRepository.save(student);
	}

	@Override
	public Student getStudentById(Long id) {
		return studentRepository.findById(id).get();
	}

	@Override
	public Student updateStudent(Student student) {
		return studentRepository.save(student);
	}

	@Override
	public void deleteStudentById(Long id) {
		studentRepository.deleteById(id);
	}

}
