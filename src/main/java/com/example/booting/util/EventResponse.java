package com.example.booting.util;

import java.time.LocalDateTime;

public class EventResponse {

    private Long id;
    private String title;
    private String organizerEmail;
    private Double ticketPrice;
    private String description;
    private LocalDateTime createdAt;

    public EventResponse() {
    }

    public Long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getOrganizerEmail() {
        return organizerEmail;
    }

    public Double getTicketPrice() {
        return ticketPrice;
    }

    public String getDescription() {
        return description;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setOrganizerEmail(String organizerEmail) {
        this.organizerEmail = organizerEmail;
    }

    public void setTicketPrice(Double ticketPrice) {
        this.ticketPrice = ticketPrice;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }
}