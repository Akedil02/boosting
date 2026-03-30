CREATE TABLE events (
    id BIGSERIAL PRIMARY KEY,
    title VARCHAR(255) NOT NULL,
    organizer_email VARCHAR(255),
    ticket_price DOUBLE PRECISION,
    created_at TIMESTAMP
);