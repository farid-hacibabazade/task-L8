package com.example.task_L8.service;

import com.example.task_L8.model.StudentDetailResponse;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

@Service
public class StudentService {

    public StudentDetailResponse getStudent(Long id) {

        Map<Long, StudentDetailResponse> map = new ConcurrentHashMap<>();
        map.put(1L, StudentDetailResponse.builder()
                .fullName("Aqsin Aliyev")
                .group("MR-23")
                .grade(92)
                .phoneNumber("235-652-41-52")
                .birthDate(LocalDate.of(2004, 9, 14))
                .build());
        map.put(2L, StudentDetailResponse.builder()
                .fullName("Leyla Muradova")
                .group("TK-63")
                .grade(88)
                .phoneNumber("741-652-36-52")
                .birthDate(LocalDate.of(2003, 3, 3))
                .build());
        map.put(3L, StudentDetailResponse.builder()
                .fullName("Gunel Ahmedova")
                .group("TI-41")
                .grade(74)
                .phoneNumber("132-142-41-52")
                .birthDate(LocalDate.of(2005, 5, 22))
                .build());
        map.put(4L, StudentDetailResponse.builder()
                .fullName("Elvin Cumayev")
                .group("IKT-32")
                .grade(85)
                .phoneNumber("735-952-41-22")
                .birthDate(LocalDate.of(2002, 1, 7))
                .build());
        map.put(5L, StudentDetailResponse.builder()
                .fullName("Tofiq Hesenli")
                .group("FM-53")
                .grade(61)
                .phoneNumber("365-752-91-32")
                .birthDate(LocalDate.of(2006, 4, 13))
                .build());

        return map.get(id);
    }
}
