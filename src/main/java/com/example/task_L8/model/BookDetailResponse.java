package com.example.task_L8.model;

import lombok.*;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class BookDetailResponse {
    private String author;
    private String bookName;
    private String genre;
    private int pageCount;
}
