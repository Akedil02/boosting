CREATE TABLE notifications (
    id BIGSERIAL PRIMARY KEY,
    user_id VARCHAR(255) NOT NULL,
    post_id VARCHAR(36) NOT NULL,
    message TEXT NOT NULL,
    created_at TIMESTAMP NOT NULL
);
