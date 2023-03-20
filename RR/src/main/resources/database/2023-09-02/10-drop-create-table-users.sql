--liquibase formatted sql
--changeset bszpunar:11

drop table users;

create table users(
    id int AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(150) NOT NULL,
    email VARCHAR(150) NOT NULL,
    password VARCHAR(150) NOT NULL,
    roles VARCHAR(150) NOT NULL
);