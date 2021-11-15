package com.example.sms.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.sms.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Long>{

}
