package com.example.task_L8.service;

import com.example.task_L8.model.CarDetailResponse;
import com.example.task_L8.model.CinemaDetailResponse;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

@Service
public class CinemaService {

    public CinemaDetailResponse getCinema(Long id) {

        Map<Long, CinemaDetailResponse> map = new ConcurrentHashMap<>();
        map.put(1L, CinemaDetailResponse.builder()
                .movieName("Dune")
                .directorOfMovie("Denis Villeneuve")
                .saloon(3)
                .capacityOfSaloon(120)
                .streamTime(LocalDateTime.of(2024, 11, 23, 14, 30))
                .build());
        map.put(2L, CinemaDetailResponse.builder()
                .movieName("Oppenheimer")
                .directorOfMovie("Christopher Nolan")
                .saloon(1)
                .capacityOfSaloon(150)
                .streamTime(LocalDateTime.of(2024, 11, 24, 19, 0))
                .build());
        map.put(3L, CinemaDetailResponse.builder()
                .movieName("Blade Runner 2049")
                .directorOfMovie("Denis Villeneuve")
                .saloon(5)
                .capacityOfSaloon(110)
                .streamTime(LocalDateTime.of(2024, 11, 25, 20, 0))
                .build());
        map.put(4L, CinemaDetailResponse.builder()
                .movieName("Parasite")
                .directorOfMovie("Bong Joon Ho")
                .saloon(4)
                .capacityOfSaloon(200)
                .streamTime(LocalDateTime.of(2024, 11, 26, 19, 0))
                .build());
        map.put(5l, CinemaDetailResponse.builder()
                .movieName("1917")
                .directorOfMovie("Sam Mendes")
                .saloon(2)
                .capacityOfSaloon(140)
                .streamTime(LocalDateTime.of(2024, 11, 27, 21, 0))
                .build());

        return map.get(id);
    }
}
