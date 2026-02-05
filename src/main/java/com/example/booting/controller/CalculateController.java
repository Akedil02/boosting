package com.example.booting.controller;

import com.example.booting.util.CalculateRequest;
import com.example.booting.util.CalculateResponse;
import com.example.booting.service.CalculateService;
import org.springframework.web.bind.annotation.*;

@RestController
public class CalculateController {

    private final CalculateService calculateService;


    public CalculateController(CalculateService calculateService) {
        this.calculateService = calculateService;
    }

    @PostMapping("/api/calculate")
    public CalculateResponse calculate(@RequestBody CalculateRequest request){
        return calculateService.add(request);
    }

}
