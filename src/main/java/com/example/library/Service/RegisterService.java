package com.example.library.Service;

import com.example.library.DAO.RegisterDao;
import org.springframework.stereotype.Service;

@Service
public class RegisterService {
    private RegisterDao registerDao;
    public void addUser(String username,String password,String email){
        registerDao.addUser(username,password,email);
    }
}
