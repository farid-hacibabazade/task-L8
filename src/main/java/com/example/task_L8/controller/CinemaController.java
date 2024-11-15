package com.example.task_L8.controller;

import com.example.task_L8.model.CinemaDetailResponse;
import com.example.task_L8.service.CinemaService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("v1/cinemas")
public class CinemaController {

    private final CinemaService cinemaService;

    @GetMapping("/{id}")
    public CinemaDetailResponse getCinema(@PathVariable Long id) {
        return cinemaService.getCinema(id);
    }
}
