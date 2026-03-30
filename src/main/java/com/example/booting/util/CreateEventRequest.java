package com.example.booting.util;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;

public class CreateEventRequest {

    @NotBlank(message = "Title must not be blank")
    private String title;

    @Email(message = "Organizer email must be valid")
    private String organizerEmail;

    @Min(value = 0, message = "Ticket price must be at least 0")
    private Double ticketPrice;

    private String description;

    public CreateEventRequest() {
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
}