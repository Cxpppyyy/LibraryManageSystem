package com.example.library.Service;

import com.example.library.DAO.BookInfoDao;
import com.example.library.Model.BookInfo;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookInfoService {
    private final BookInfoDao bookInfoDao;

    public BookInfoService(BookInfoDao bookInfoDao) {
        this.bookInfoDao = bookInfoDao;
    }

    public List<BookInfo> getAllBooks() {
        return bookInfoDao.findAll();
    }
}
