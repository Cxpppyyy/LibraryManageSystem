package com.example.library.DAO;

import com.example.library.Model.BookDetails;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public class BookDetailsDao {
    private final JdbcTemplate jdbcTemplate;

    public BookDetailsDao(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public List<BookDetails> searchBooks(String query) {
        String sql = "SELECT * FROM bookdetails WHERE book_name LIKE ?";
        return jdbcTemplate.query(sql, new Object[]{"%" + query + "%"}, (rs, rowNum) -> {
            return new BookDetails(
                    rs.getInt("book_id"),
                    rs.getString("book_name"),
                    rs.getString("publisher"),
                    rs.getDate("publication_date"),
                    rs.getBoolean("is_borrowed"),
                    rs.getObject("borrower_id") != null ? rs.getInt("borrower_id") : null, // 处理可能的空值
                    rs.getDate("start_date"),
                    rs.getDate("due_date"),
                    rs.getInt("book_info_id")
            );
        });
    }

    public BookDetails addBook(BookDetails bookDetails) {
        String sql = "INSERT INTO bookdetails (book_name, publisher, publication_date, is_borrowed, borrower_id, start_date, due_date, book_info_id) VALUES (?, ?, ?, ?, ?, ?, ?, ?)";

        jdbcTemplate.update(sql,
                bookDetails.getBookName(),
                bookDetails.getPublisher(),
                bookDetails.getPublicationDate(),
                bookDetails.isBorrowed(),
                bookDetails.getBorrowerId(),
                bookDetails.getStartDate(),
                bookDetails.getDueDate(),
                bookDetails.getBookInfoId());

        Integer newId = jdbcTemplate.queryForObject("SELECT LAST_INSERT_ID()", Integer.class);
        bookDetails.setBookId(newId);
        return bookDetails;
    }

    public BookDetails updateBook(int id, BookDetails bookDetails) {
        String sql = "UPDATE bookdetails SET book_name = ?, publisher = ?, publication_date = ?, is_borrowed = ?, borrower_id = ?, start_date = ?, due_date = ?, book_info_id = ? WHERE book_id = ?";

        jdbcTemplate.update(sql,
                bookDetails.getBookName(),
                bookDetails.getPublisher(),
                bookDetails.getPublicationDate(),
                bookDetails.isBorrowed(),
                bookDetails.getBorrowerId(),
                bookDetails.getStartDate(),
                bookDetails.getDueDate(),
                bookDetails.getBookInfoId(),
                id);

        return bookDetails;
    }


}
