package com.example.library.Controller;

import com.example.library.Service.indexService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


import java.util.HashMap;

@CrossOrigin(origins = "*",maxAge = 3600)
@RestController
@RequestMapping("/api")
public class indexController {
    @Autowired
    private indexService indexService;
    @PostMapping("/register")
    public ResponseEntity<?> register(String username, String password, String email) {
        indexService.addUser(username, password, email);
        return ResponseEntity.ok().body(new HashMap<String, Object>() {{
            put("success", true);
            put("message", "用户注册成功");
        }});
    }
    @PostMapping("/login")
    public ResponseEntity<?> login(String username, String password) {
        boolean loginSuccess = indexService.validateUser(username, password);
        if (loginSuccess) {
            Integer loginId = indexService.getLoginIdByUsername(username);
            // 登录成功，返回成功响应
            return ResponseEntity.ok().body(new HashMap<String, Object>() {{
                put("success", true);
                put("loginId", loginId);
                put("message", "登录成功");
            }});
        } else {
            // 登录失败，返回失败响应
            return ResponseEntity.badRequest().body(new HashMap<String, Object>() {{
                put("success", false);
                put("message", "登录失败");
            }});
        }
    }

}
