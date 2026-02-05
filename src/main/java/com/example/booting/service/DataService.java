package com.example.booting.service;

import com.example.booting.util.DataResponse;
import com.example.booting.repository.DataRepository;
import org.springframework.stereotype.Service;

@Service
public class DataService {

    private final ExternalApiClient externalApiClient;
    private final DataRepository dataRepository;

    public DataService(ExternalApiClient externalApiClient, DataRepository dataRepository) {
        this.externalApiClient = externalApiClient;
        this.dataRepository = dataRepository;
    }

    public DataResponse getData() {
        String value = externalApiClient.fetchJoke();
        dataRepository.saveLastValue(value);
        return new DataResponse("external-api", value);
    }
}
