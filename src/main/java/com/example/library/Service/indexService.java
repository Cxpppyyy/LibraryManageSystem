package com.example.library.Service;

import com.example.library.DAO.indexDao;
import com.example.library.Model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class indexService {
    private indexDao indexDao;
    @Autowired
    public indexService(indexDao indexDao) {
        this.indexDao = indexDao;
    }
    public void addUser(String username,String password,String email){
        indexDao.addUser(username,password,email);
    }
    public boolean validateUser(String username, String password) {
        return indexDao.validateUser(username, password);
    }
    public Integer getLoginIdByUsername(String username) {
        return indexDao.getLoginIdByUsername(username);
    }
    public User getUserByLoginId(String loginId) {
        return indexDao.findUserByLoginId(loginId);
    }



}
