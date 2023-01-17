package com.example.springbootjoins.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.springbootjoins.dto.StudentRequest;
import com.example.springbootjoins.dto.StudentResponse;
import com.example.springbootjoins.entity.Classroom;
import com.example.springbootjoins.entity.Student;
import com.example.springbootjoins.repository.ClassroomRepository;
import com.example.springbootjoins.repository.StudentRepository;



@Service
public class StudentService {
    
    @Autowired
    private StudentRepository studentRepository;
    @Autowired
    private ClassroomRepository classroomRepository;

    // GET /findAllStudents
    public List<StudentResponse> findAllStudentsWithClassroom() {
        // use StudentResponse to return the data: 1. find all students 2. map the student to StudentResponse 3. collect the data to a list
        return studentRepository.findAll().stream().map(student -> {
            StudentResponse studentResponse = new StudentResponse();
            studentResponse.setId(student.getId());
            studentResponse.setName(student.getName());
            studentResponse.setAge(student.getAge());
            studentResponse.setClassroom(student.getClassroom().getName());
            return studentResponse;
        }).collect(Collectors.toList());
    }

    // POST /addStudent
    public Student saveStudent(StudentRequest studentRequest) {
        // use StudentRequest to get the data: 1. find the classroom by id 2. create a new student 3. save the student
        Classroom classroom = classroomRepository.findById(studentRequest.getClass_id()).get();
        Student student = new Student();
        student.setName(studentRequest.getName());
        student.setAge(studentRequest.getAge());
        student.setClassroom(classroom);
        return studentRepository.save(student);
    }
}
