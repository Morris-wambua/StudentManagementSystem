package com.example.sms.crons;

import com.example.sms.entity.Student;
import com.example.sms.repositories.StudentRepository;
import com.example.sms.services.StudentService;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@EnableScheduling
public class DisplayFourStudentsCron {

    private StudentService studentService;

    public DisplayFourStudentsCron(StudentService studentService) {
        this.studentService = studentService;
    }

    @Scheduled(cron="1 * * * * *")
    public void displayRestStudents(){

        System.out.println("Started the cron2");
        studentService.backUpDB();
        System.out.println("Complete cron 2");
    }

    }

