CREATE TABLE payload (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    record_type VARCHAR(255) NOT NULL,
    device_id VARCHAR(255) NOT NULL,
    event_date_time VARCHAR(255) NOT NULL,
    field_a INT NOT NULL,
    field_b VARCHAR(255) NOT NULL,
    field_c DOUBLE NOT NULL
);