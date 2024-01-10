package com.example.library.DAO;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class indexDao {
    @Autowired
    private JdbcTemplate jdbcTemplate;
    public void addUser(String username,String password,String email){
        String sql = "INSERT INTO login(login_name,login_password,login_email) values(?,?,?)";
        jdbcTemplate.update(sql,username,password,email);
    }
    public boolean validateUser(String username, String password) {
        String sql = "SELECT COUNT(*) FROM login WHERE login_name = ? AND login_password = ?";
        Integer count = jdbcTemplate.queryForObject(sql, new Object[]{username, password}, Integer.class);
        return count != null && count > 0;
    }

}