--liquibase formatted sql
--changeset bszpunar:2
CREATE TABLE BULLETS(
    id INT AUTO_INCREMENT PRIMARY KEY,
    revolver_id INT
);


ALTER TABLE BULLETS ADD FOREIGN KEY (revolver_id) REFERENCES REVOLVERS(id);
