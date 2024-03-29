package com.example.library.Controller;

import com.example.library.Model.BookDetails;
import com.example.library.Service.BookDetailsService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
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

    @DeleteMapping("/bookdetails/{id}")
    public void deleteBook(@PathVariable int id) {
        bookDetailsService.deleteBook(id);
    }

    @PostMapping("/borrow/{bookInfoId}/{borrowerId}")
    public ResponseEntity<String> borrowBook(@PathVariable int bookInfoId, @PathVariable int borrowerId) {
        bookDetailsService.borrowBook(bookInfoId, borrowerId);
        return ResponseEntity.ok("Borrowing request successful.");
    }


}
