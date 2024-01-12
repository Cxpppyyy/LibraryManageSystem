package com.example.library.Controller;

import com.example.library.Service.BookInfoService;
import com.example.library.Model.BookInfo;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/api")
public class BookInfoController {
    private final BookInfoService bookInfoService;

    public BookInfoController(BookInfoService bookInfoService) {
        this.bookInfoService = bookInfoService;
    }

    @GetMapping("/books")
    public List<BookInfo> viewBooks() {
        return bookInfoService.getAllBooks();
    }

    @PostMapping("/add")
    public ResponseEntity<String> addBook(@RequestBody BookInfo bookInfo) {
        bookInfoService.addBook(bookInfo);
        return ResponseEntity.ok("Book added successfully");
    }
}

