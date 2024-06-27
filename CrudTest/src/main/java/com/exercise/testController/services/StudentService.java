package com.exercise.testController.services;

import com.exercise.testController.entities.Student;
import com.exercise.testController.repositories.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class StudentService {
    @Autowired
    private StudentRepository studentRepository;

    public Student setStudentIsWorking(Long studentId, Boolean working) {
        Optional<Student> student = studentRepository.findById(studentId);
        if (student.isPresent()) {
            student.get().setIsWorking(working);
            return studentRepository.saveAndFlush(student.get());
        } else return null;
    }
}
