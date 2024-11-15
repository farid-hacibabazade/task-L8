package com.example.task_L8.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class StudentDetailResponse {
    private String fullName;
    private String group;
    private Integer grade;
    private String phoneNumber;
    private LocalDate birthDate;
}
