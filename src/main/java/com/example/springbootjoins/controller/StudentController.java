package com.example.springbootjoins.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.springbootjoins.dto.StudentRequest;
import com.example.springbootjoins.dto.StudentResponse;
import com.example.springbootjoins.entity.Student;
import com.example.springbootjoins.service.StudentService;

@RestController
public class StudentController {
    
    @Autowired
    private StudentService studentService;

    @PostMapping("/addStudent")
    public Student saveStudent(@RequestBody StudentRequest studentRequest) {
        return studentService.saveStudent(studentRequest);
    }

    @GetMapping("/findAllStudents")
    public List<StudentResponse> findAllStudents() {
        // use StudentResponse to return the data: 1. find all students 2. map the student to StudentResponse 3. collect the data to a list
        return studentService.findAllStudentsWithClassroom();
    }
}
