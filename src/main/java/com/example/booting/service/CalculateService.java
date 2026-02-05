package com.example.booting.service;

import com.example.booting.util.CalculateRequest;
import com.example.booting.util.CalculateResponse;
import org.springframework.stereotype.Service;
@Service
public class CalculateService {


    public CalculateResponse add(CalculateRequest request){
        int result = request.getA()+ request.getB();
        return new CalculateResponse(result);
    }
}
