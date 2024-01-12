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

}
