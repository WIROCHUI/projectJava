delete from departamento;
delete from tipo_empleado;
delete from estado_civil;

INSERT INTO departamento (id, nombre) VALUES (1,'Sistemas');
INSERT INTO departamento (id, nombre) VALUES (2,'Contabilidad');

INSERT INTO tipo_empleado (id, nombre) VALUES (1,'Tiempo Completo');
INSERT INTO tipo_empleado (id, nombre) VALUES (2,'Tiempo Medio');

INSERT INTO estado_civil (id, nombre) VALUES (1,'Soltero');
INSERT INTO estado_civil (id, nombre) VALUES (2,'Casado');

delete from authorities_users;
delete from authority;
delete from usuario;

INSERT INTO usuario (id,enabled,password,username) VALUES(1,0b1,"$2a$04$Rdk73vMslUwl6SJhcSd8aOLns7V8DLMQGa0SrgTwOzbuOsBRTtTZK","admin"); -- password: 1234
INSERT INTO usuario (id,enabled,password,username) VALUES(2,0b1,"$2a$04$eFyQ5XDrVBrLelaVVEpH0uBVESfVZEiArJfdZFfMWL0AQry7Eifbe","user"); -- password: 1234

INSERT INTO authority (id,authority) VALUES (1,"ROLE_ADMIN");
INSERT INTO authority (id,authority) VALUES (2,"ROLE_USER");

INSERT INTO authorities_users (usuario_id, authority_id) VALUES (1,1);
INSERT INTO authorities_users (usuario_id, authority_id) VALUES (1,2);
INSERT INTO authorities_users (usuario_id, authority_id) VALUES (2,2);