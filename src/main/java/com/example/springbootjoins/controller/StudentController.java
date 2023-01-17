package com.example.springbootjoins.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.springbootjoins.dto.StudentRequest;
import com.example.springbootjoins.dto.StudentResponse;
import com.example.springbootjoins.entity.Student;
import com.example.springbootjoins.service.StudentService;

@RestController
@RequestMapping("/students")
public class StudentController {
    
    @Autowired
    private StudentService studentService;

    @PostMapping("")
    public Student saveStudent(@RequestBody StudentRequest studentRequest) {
        return studentService.saveStudent(studentRequest);
    }

    @GetMapping("")
    public List<StudentResponse> findAllStudents() {
        return studentService.findAllStudentsWithClassroom();
    }
}
