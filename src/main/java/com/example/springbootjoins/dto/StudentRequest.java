package com.example.springbootjoins.dto;

import org.hibernate.validator.constraints.Range;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class StudentRequest {
    
    @Size(min = 3, max = 20, message = "Name must be between 3 and 20 characters")
    private String name;

    @Min(value = 18, message = "Age must be greater than 18")
    private int age;

    @Range(min = 1, max = 2, message ="Classroom must be between 1 and 2")
    private Long class_id;
}
