package com.example.task_L8.service;

import com.example.task_L8.model.FlightDetailResponse;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

@Service
public class FlightService {

    public FlightDetailResponse getFlight(Long id) {

        Map<Long, FlightDetailResponse> map = new ConcurrentHashMap<>();
        map.put(1L, FlightDetailResponse.builder()
                .from("Baku")
                .to("London")
                .planeModel("Boeing 767")
                .arriveAt(LocalDateTime.of(2024, 11, 15, 8, 0))
                .passengerCount(120)
                .pilotName("Vasif")
                .build());

        map.put(2L, FlightDetailResponse.builder()
                .from("Baku")
                .to("Dubai")
                .planeModel("GulfStream G700")
                .arriveAt(LocalDateTime.of(2024, 11, 16, 17, 35))
                .passengerCount(22)
                .pilotName("Ilqar")
                .build());

        map.put(3L, FlightDetailResponse.builder()
                .from("Baku")
                .to("Istanbul")
                .planeModel("Boeing 737")
                .arriveAt(LocalDateTime.of(2024, 11, 18, 12, 15))
                .passengerCount(200)
                .pilotName("John")
                .build());

        map.put(4L, FlightDetailResponse.builder()
                .from("Baku")
                .to("Los Angeles")
                .planeModel("Boeing 737-800")
                .arriveAt(LocalDateTime.of(2024, 11, 18, 14, 45))
                .passengerCount(210)
                .pilotName("Jason")
                .build());

        map.put(5L, FlightDetailResponse.builder()
                .from("Baku")
                .to("Italy")
                .planeModel("Boeing 787")
                .arriveAt(LocalDateTime.of(2024, 11, 19, 03, 00))
                .passengerCount(246)
                .pilotName("Murad")
                .build());

        return map.get(id);
    }
}
