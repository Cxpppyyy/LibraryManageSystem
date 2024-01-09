package com.example.library.Controller;

import com.example.library.Service.RegisterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@CrossOrigin(origins = "*",maxAge = 3600)
@RestController
@RequestMapping("/api")
public class RegisterController {
    @Autowired
    private RegisterService registerService;
    @PostMapping("/register")
    public String register(String username,String password,String email){
        registerService.addUser(username,password,email);
        return "用户注册成功";
    }
}
