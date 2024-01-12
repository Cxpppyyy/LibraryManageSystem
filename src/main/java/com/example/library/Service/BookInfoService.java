package com.example.library.Service;

import com.example.library.DAO.BookInfoDao;
import com.example.library.Model.BookInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookInfoService {
    private final BookInfoDao bookInfoDao;
@Autowired
    public BookInfoService(BookInfoDao bookInfoDao) {
        this.bookInfoDao = bookInfoDao;
    }
    public void addBook(BookInfo bookInfo) {
        bookInfoDao.addBook(bookInfo);
    }

    public List<BookInfo> getAllBooks() {
        return bookInfoDao.findAll();
    }
}
