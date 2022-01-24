package com.example.sms.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.sms.entity.Student;
import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.stereotype.Repository;
import org.springframework.ui.Model;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long>{

    @Procedure(procedureName="display_four_students")
    void displayFourStudents();

}
