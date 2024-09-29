package com.example.json_app;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

    @RestController
    public class UserController {

        @GetMapping("/user")
        public Map<String, Object> getUser() {
            Map<String, Object> response = new HashMap<>();
            response.put("name", "Evgenii");
            response.put("age", 30);
            response.put("city", "Rehovot");
            return response;
        }
    }


