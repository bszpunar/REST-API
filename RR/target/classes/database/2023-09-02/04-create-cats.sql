--liquibase formatted sql
--changeset bszpunar:4

CREATE TABLE CATS(
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    inscription1 varchar(50) NOT NULL
);