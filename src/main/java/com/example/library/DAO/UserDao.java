package com.example.library.DAO;

import com.example.library.Model.User;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;
import java.sql.ResultSet;
import java.sql.SQLException;

@Repository
public class UserDao {
    private final JdbcTemplate jdbcTemplate;

    public UserDao(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public User findUserById(int userId) {
        return jdbcTemplate.queryForObject("SELECT * FROM users WHERE user_id = ?",
                new Object[]{userId}, new UserRowMapper());
    }

    private static final class UserRowMapper implements RowMapper<User> {
        @Override
        public User mapRow(ResultSet rs, int rowNum) throws SQLException {
            User user = new User();
            user.setUserId(rs.getInt("user_id"));
            user.setUserName(rs.getString("user_name"));
            user.setMaxBooksBorrowed(rs.getInt("max_books_borrowed"));
            user.setBooksBorrowed(rs.getInt("books_borrowed"));
            user.setVip(rs.getBoolean("is_vip"));
            user.setOverdueBooks(rs.getInt("overdue_books"));
            return user;
        }
    }

}
