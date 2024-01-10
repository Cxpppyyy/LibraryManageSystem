package com.example.library.Controller;

import com.example.library.Service.BookInfoService;
import com.example.library.Model.BookInfo;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/api")
public class BookController {
    private final BookInfoService bookInfoService;

    public BookController(BookInfoService bookInfoService) {
        this.bookInfoService = bookInfoService;
    }

    @GetMapping("/books")
    public List<BookInfo> viewBooks() {
        return bookInfoService.getAllBooks();
    }
}
