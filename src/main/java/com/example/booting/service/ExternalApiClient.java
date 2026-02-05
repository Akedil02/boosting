package com.example.booting.service;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Map;

@Service
public class ExternalApiClient {

    private final RestTemplate restTemplate;

    public ExternalApiClient(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public String fetchJoke() {
        String url = "https://api.chucknorris.io/jokes/random";
        Map<?, ?> json = restTemplate.getForObject(url, Map.class);

        return (String) json.get("value");
    }
}
