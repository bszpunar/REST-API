--liquibase formatted sql
--changeset bszpunar:10

create table users(
    id int AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(50) NOT NULL,
    email VARCHAR(50) NOT NULL,
    password VARCHAR(50) NOT NULL,
    roles VARCHAR(50) NOT NULL
);