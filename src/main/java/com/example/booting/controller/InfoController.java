package com.example.booting.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

@RestController
public class InfoController {


    @GetMapping("/api/info")
    public Map<String, Object> getInfo(){
        Map<String, Object> response = new HashMap<>();
        response.put("student", "Nurserik Akedil");
        response.put("course", "Backend Framework: Spring");
        response.put("week", 1);
        return response;
    }
}
