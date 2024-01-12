package com.example.library.Controller;

import com.example.library.Model.BookDetails;
import com.example.library.Service.BookDetailsService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/api")
public class BookDetailsController {
    private final BookDetailsService bookDetailsService;

    public BookDetailsController(BookDetailsService bookDetailsService) {
        this.bookDetailsService = bookDetailsService;
    }

    @GetMapping("/search")
    public List<BookDetails> searchBooks(@RequestParam String query) {
        return bookDetailsService.searchBooks(query);
    }

    @PostMapping("/bookdetails")
    public BookDetails addBook(@RequestBody BookDetails bookDetails) {
        return bookDetailsService.addBook(bookDetails);
    }

    @PutMapping("/bookdetails/{id}")
    public BookDetails updateBook(@PathVariable int id, @RequestBody BookDetails bookDetails) {
        return bookDetailsService.updateBook(id, bookDetails);
    }
}
