package com.example.task_L8.controller;

import com.example.task_L8.model.StudentDetailResponse;
import com.example.task_L8.service.StudentService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("v1/students")
public class StudentController {

    private final StudentService studentService;

    @GetMapping("/{id}")
    public StudentDetailResponse getStudent(@PathVariable Long id) {
        return studentService.getStudent(id);
    }
}
