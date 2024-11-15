package com.example.task_L8.controller;

import com.example.task_L8.model.BookDetailResponse;
import com.example.task_L8.service.BookService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("v1/books")
public class BookController {

    private final BookService bookService;

    @GetMapping("/{id}")
    public BookDetailResponse getBook(@PathVariable Long id) {
        return bookService.getBook(id);
    }
}
