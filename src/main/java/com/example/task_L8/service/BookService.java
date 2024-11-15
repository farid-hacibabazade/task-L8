package com.example.task_L8.service;

import com.example.task_L8.model.BookDetailResponse;
import org.springframework.stereotype.Service;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

@Service
public class BookService {

    public BookDetailResponse getBook(Long id) {

        Map<Long, BookDetailResponse> map = new ConcurrentHashMap<>();
        map.put(1L, BookDetailResponse.builder()
                .author("J.K. Rowling")
                .bookName("Harry Potter")
                .genre("Fantasy")
                .pageCount(400)
                .build());
        map.put(2L, BookDetailResponse.builder()
                .author("George Orwell")
                .bookName("Animal Farm")
                .genre("Novel")
                .pageCount(321)
                .build());
        map.put(3L, BookDetailResponse.builder()
                .author("Sun Tzu")
                .bookName("The Art of War")
                .genre("Philosophy")
                .pageCount(400)
                .build());
        map.put(4L, BookDetailResponse.builder()
                .author("Charlotte Bronte")
                .bookName("Jane Eyre")
                .genre("Romance")
                .pageCount(360)
                .build());
        map.put(5L, BookDetailResponse.builder()
                .author("John Tolkien")
                .bookName("The Hobbit")
                .genre("Fantasy")
                .pageCount(511)
                .build());

        return map.get(id);
    }
}
