package com.example.booting.service;

import com.example.booting.DTO.CreateEventRequest;
import com.example.booting.DTO.EventResponse;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface EventService {

    EventResponse createEvent(CreateEventRequest request);

    Page<EventResponse> getAllEvents(Pageable pageable);

    EventResponse getEventById(Long id);

    void deleteEvent(Long id);
}
