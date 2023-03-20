--liquibase formatted sql
--changeset bszpunar:6

CREATE TABLE ANIMALS(
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    cats_id BIGINT,
    dogs_id BIGINT,
    inscription3 varchar(50) NOT NULL
);

alter table ANIMALS add foreign key (dogs_id) references DOGS(id);
alter table ANIMALS add foreign key (cats_id) references CATS(id);