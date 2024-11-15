package com.example.task_L8.controller;

import com.example.task_L8.model.CarDetailResponse;
import com.example.task_L8.service.CarService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("v1/cars")
public class CarController {

    private final CarService carService;

    @GetMapping("/{id}")
    public CarDetailResponse getCar(@PathVariable Long id) {
        return carService.getCar(id);
    }
}
