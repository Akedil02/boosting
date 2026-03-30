package com.example.booting.service;

import com.example.booting.util.CreateEventRequest;
import com.example.booting.util.EventResponse;

import java.util.List;

public interface EventService {

    EventResponse createEvent(CreateEventRequest request);

    List<EventResponse> getAllEvents();

    EventResponse getEventById(Long id);

    void deleteEvent(Long id);
}