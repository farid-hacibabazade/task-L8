package com.example.task_L8.service;

import com.example.task_L8.model.CarDetailResponse;
import org.springframework.stereotype.Service;

import java.time.Year;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

@Service
public class CarService {

    public CarDetailResponse getCar(Long id) {

        Map<Long, CarDetailResponse> map = new ConcurrentHashMap<>();
        map.put(1L, CarDetailResponse.builder()
                .brand("Mercedes")
                .model("E300")
                .productionYear(Year.of(2023))
                .fuelType("Benzin")
                .price(75_000)
                .build());
        map.put(2L, CarDetailResponse.builder()
                .brand("Acura")
                .model("NSX")
                .productionYear(Year.of(2024))
                .fuelType("Benzin")
                .price(130_000)
                .build());
        map.put(3L, CarDetailResponse.builder()
                .brand("Land Rover")
                .model("RR Sport")
                .productionYear(Year.of(2019))
                .fuelType("Hybrid")
                .price(61_000)
                .build());
        map.put(4L, CarDetailResponse.builder()
                .brand("Nissan")
                .model("Patrol")
                .productionYear(Year.of(2015))
                .fuelType("Dizel")
                .price(33_000)
                .build());
        map.put(5L, CarDetailResponse.builder()
                .brand("Lexus")
                .model("LX570")
                .productionYear(Year.of(2020))
                .fuelType("Dizel")
                .price(88_500)
                .build());

        return map.get(id);
    }
}
