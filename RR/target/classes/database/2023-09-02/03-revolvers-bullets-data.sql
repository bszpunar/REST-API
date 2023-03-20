--liquibase formatted sql
--changeset bszpunar:3
insert into REVOLVERS(id, model, price) values (1, 'Revolver 1', 100);
insert into REVOLVERS(id, model, price) values (2, 'Revolver 2', 200);
insert into REVOLVERS(id, model, price) values (3, 'Revolver 3', 300);
insert into REVOLVERS(id, model, price) values (4, 'Revolver 4', 400);
insert into REVOLVERS(id, model, price) values (5, 'Revolver 5', 500);
insert into REVOLVERS(id, model, price) values (6, 'Revolver 6', 1500);

insert into BULLETS(id, revolver_id) values (1, 1);
insert into BULLETS(id, revolver_id) values (2, 1);
insert into BULLETS(id, revolver_id) values (3, 1);
insert into BULLETS(id, revolver_id) values (4, 2);
insert into BULLETS(id, revolver_id) values (5, 2);
insert into BULLETS(id, revolver_id) values (6, 2);
insert into BULLETS(id, revolver_id) values (7, 3);
insert into BULLETS(id, revolver_id) values (8, 3);
insert into BULLETS(id, revolver_id) values (9, 3);
insert into BULLETS(id, revolver_id) values (10, 4);
insert into BULLETS(id, revolver_id) values (11, 4);
insert into BULLETS(id, revolver_id) values (12, 4);
insert into BULLETS(id, revolver_id) values (13, 5);
insert into BULLETS(id, revolver_id) values (14, 5);
insert into BULLETS(id, revolver_id) values (15, 5);
insert into BULLETS(id, revolver_id) values (16, 6);
insert into BULLETS(id, revolver_id) values (17, 6);
insert into BULLETS(id, revolver_id) values (18, 6);
