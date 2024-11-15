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
public class FlightDetailResponse {
    private String from;
    private String to;
    private String planeModel;
    private LocalDateTime arriveAt;
    private Integer passengerCount;
    private String pilotName;
}
