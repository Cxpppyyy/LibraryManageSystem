package com.example.library.Service;

import com.example.library.DAO.RegisterDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RegisterService {
    private RegisterDao registerDao;
    @Autowired
    public RegisterService(RegisterDao registerDao) {
        this.registerDao = registerDao;
    }
    public void addUser(String username,String password,String email){
        registerDao.addUser(username,password,email);
    }
}
