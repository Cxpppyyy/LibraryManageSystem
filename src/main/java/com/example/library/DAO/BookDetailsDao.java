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
                    rs.getObject("borrower_id") != null ? rs.getInt("borrower_id") : null,
                    rs.getDate("start_date"),
                    rs.getDate("due_date"),
                    rs.getInt("book_info_id")
            );
        });
    }



    public void deleteBook(int id) {
        String sql = "DELETE FROM bookdetails WHERE book_id = ?";
        jdbcTemplate.update(sql, id);
    }

    public void borrowBook(int bookInfoId, int borrowerId) {

        String sqlCheckAvailable = "SELECT count(*) FROM bookdetails WHERE book_info_id = ? AND is_borrowed = 0";
        Integer availableCount = jdbcTemplate.queryForObject(sqlCheckAvailable, new Object[]{bookInfoId}, Integer.class);

        if (availableCount != null && availableCount > 0) {

            String sqlUpdateBookDetails = "UPDATE bookdetails SET is_borrowed = 1, borrower_id = ?, start_date = NOW(), due_date = DATE_ADD(NOW(), INTERVAL 1 MONTH) WHERE book_info_id = ? AND is_borrowed = 0 LIMIT 1";
            jdbcTemplate.update(sqlUpdateBookDetails, borrowerId, bookInfoId);


            String sqlUpdateBookInfo = "UPDATE bookinfo SET available_books = available_books - 1 WHERE book_info_id = ?";
            jdbcTemplate.update(sqlUpdateBookInfo, bookInfoId);


            String sqlUpdateUsers = "UPDATE users SET books_borrowed = books_borrowed + 1 WHERE login_id = ?";
            jdbcTemplate.update(sqlUpdateUsers, borrowerId);
        } else {
            throw new IllegalStateException("No available books to borrow.");
        }
    }

}
