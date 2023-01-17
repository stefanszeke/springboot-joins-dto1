package com.example.springbootjoins.dto;

import lombok.Data;

@Data
public class StudentResponse {
    
    private Long id;
    private String name;
    private int age;
    private String classroom;
}
