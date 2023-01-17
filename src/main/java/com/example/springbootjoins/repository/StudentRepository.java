package com.example.springbootjoins.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.springbootjoins.entity.Student;


public interface StudentRepository extends JpaRepository<Student, Long> {

}