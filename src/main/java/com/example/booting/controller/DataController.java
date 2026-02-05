package com.example.booting.controller;

import com.example.booting.util.DataResponse;
import com.example.booting.service.DataService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DataController {

    private final DataService dataService;

    public DataController(DataService dataService) {
        this.dataService = dataService;
    }

    @GetMapping("/api/data")
    public DataResponse getData() {
        return dataService.getData();
    }
}
