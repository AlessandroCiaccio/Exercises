package com.exercise.testController.controllers;

import com.exercise.testController.entities.Student;
import com.exercise.testController.repositories.StudentRepository;
import com.exercise.testController.services.StudentService;
import org.antlr.v4.runtime.misc.NotNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/v1")
public class StudentController {
    @Autowired
    private StudentRepository studentRepository;
    @Autowired
    private StudentService studentService;

    @PostMapping("/createStudent")
    public @ResponseBody Student createStudent(@RequestBody Student student) {
        return studentRepository.saveAndFlush(student);
    }

    @GetMapping("/getAllStudents")
    public @ResponseBody List<Student> getAllStudents() {
        if (studentRepository.count() > 0) {
            return studentRepository.findAll();
        } else return null;
    }

    @GetMapping("/getOneStudent/{id}")
    public @ResponseBody Student getOneStudent(@PathVariable long id) {
        if (studentRepository.existsById(id)) {
            return studentRepository.getReferenceById(id);
        } else return null;
    }

    @PatchMapping("/changeNameStudent/{id}")
    public @ResponseBody Student changeNameStudent(@PathVariable long id, @RequestBody Student student) {
        if (studentRepository.existsById(id)) {
            Student foundStudent=studentRepository.getReferenceById(id);
            foundStudent.setName(student.getName());
            return studentRepository.saveAndFlush(foundStudent);
        } else return null;
    }

    @PatchMapping("/changeIsWorkingStudent/{id}")
    public @ResponseBody Student changeIsWorkingStudent(@PathVariable long id, @RequestParam(name = "working") Boolean working) {
        if (studentRepository.existsById(id)) {
            Student foundStudent=studentRepository.getReferenceById(id);
            foundStudent.setIsWorking(working);
            return studentRepository.saveAndFlush(foundStudent);
        } else return null;
    }

    @DeleteMapping("/deleteOneStudent/{id}")
    public @ResponseBody Boolean deleteOneStudent(@PathVariable long id) {
        studentRepository.deleteById(id);
        return !studentRepository.existsById(id);
    }
}
