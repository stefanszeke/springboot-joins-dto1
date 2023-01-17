package com.example.springbootjoins.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.springbootjoins.entity.Classroom;


public interface ClassroomRepository extends JpaRepository<Classroom, Long>{
    
}
