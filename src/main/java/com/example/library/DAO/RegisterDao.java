package com.example.library.DAO;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class RegisterDao {
    @Autowired
    private JdbcTemplate jdbcTemplate;
    public void addUser(String username,String password,String email){
        String sql = "INSERT INTO users(login_name,login_password,login_email) values(?,?,?)";
        jdbcTemplate.update(sql,username,password,email);
    }
}
