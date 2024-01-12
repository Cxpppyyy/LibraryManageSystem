package com.example.library.Service;

import com.example.library.DAO.BookDetailsDao;
import com.example.library.Model.BookDetails;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class BookDetailsService {
    private final BookDetailsDao bookDetailsDao;

    public BookDetailsService(BookDetailsDao bookDetailsDao) {
        this.bookDetailsDao = bookDetailsDao;
    }

    public List<BookDetails> searchBooks(String query) {
        return bookDetailsDao.searchBooks(query);
    }

    public BookDetails addBook(BookDetails bookDetails) {
        return bookDetailsDao.addBook(bookDetails);
    }

    public BookDetails updateBook(int id, BookDetails bookDetails) {
        return bookDetailsDao.updateBook(id, bookDetails);
    }

}
