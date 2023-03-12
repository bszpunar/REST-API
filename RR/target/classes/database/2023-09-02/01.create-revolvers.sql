--liquibase formatted sql
--changeset bszpunar:1
CREATE TABLE REVOLVERS(
    id INT AUTO_INCREMENT PRIMARY KEY,
    model VARCHAR(100),
    price INT
);