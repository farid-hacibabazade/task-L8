package com.example.task_L8.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CinemaDetailResponse {

    private String movieName;
    private String directorOfMovie;
    private int saloon;
    private int capacityOfSaloon;
    private LocalDateTime streamTime;
}
