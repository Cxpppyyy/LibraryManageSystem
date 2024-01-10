package com.example.library.DAO;

import com.example.library.Model.BookInfo;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

@Repository
public class BookInfoDao {
    private final JdbcTemplate jdbcTemplate;

    public BookInfoDao(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public List<BookInfo> findAll() {
        return jdbcTemplate.query("SELECT * FROM bookinfo", new BookInfoRowMapper());
    }

    private static final class BookInfoRowMapper implements RowMapper<BookInfo> {
        @Override
        public BookInfo mapRow(ResultSet rs, int rowNum) throws SQLException {
            BookInfo book = new BookInfo();
            book.setBookInfoId(rs.getInt("book_info_id"));
            book.setBookName(rs.getString("book_name"));
            book.setPublisher(rs.getString("publisher"));
            book.setPublicationDate(rs.getDate("publication_date"));
            book.setTotalStock(rs.getInt("total_stock"));
            book.setAvailableBooks(rs.getInt("available_books"));
            return book;
        }
    }
}
