package com.example.task_L8.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Year;
import java.time.YearMonth;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CarDetailResponse {

    private String brand;
    private String model;
    private Year productionYear;
    private String fuelType;
    private Integer price;
}
