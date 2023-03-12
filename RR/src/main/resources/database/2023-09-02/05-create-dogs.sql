--liquibase formatted sql
--changeset bszpunar:5

CREATE TABLE DOGS(
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    inscription2 varchar(50) NOT NULL
);

