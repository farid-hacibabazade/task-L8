package com.example.task_L8.controller;

import com.example.task_L8.model.FlightDetailResponse;
import com.example.task_L8.service.FlightService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("v1/flights")
public class FlightController {

    private final FlightService flightService;

    @GetMapping("/{id}")
    public FlightDetailResponse getFlight(@PathVariable Long id) {
        return flightService.getFlight(id);
    }
}
