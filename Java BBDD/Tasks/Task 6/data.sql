CREATE TABLE alumnos (
                         numero_cuenta INT PRIMARY KEY,
                         nombre VARCHAR(50),
                         apellido_paterno VARCHAR(50),
                         apellido_materno VARCHAR(50),
                         fecha_nacimiento DATE
);

CREATE TABLE profesores (
                            id_profesor INT PRIMARY KEY,
                            nombre VARCHAR(100),
                            titulo VARCHAR(100),
                            fecha_contratacion DATE
);

CREATE TABLE materias (
                          id_materia INT  PRIMARY KEY,
                          nombre VARCHAR(100),
                          creditos INT
);

CREATE TABLE salones (
                         id_salon INT  PRIMARY KEY,
                         nombre VARCHAR(50),
                         capacidad INT
);

CREATE TABLE grupos (
                        id_grupo INT  PRIMARY KEY,
                        id_salon INT,
                        semestre VARCHAR(10),
                        FOREIGN KEY (id_salon) REFERENCES salones(id_salon)
);

-- Tablas intermedias
CREATE TABLE materia_grupo (
                               id_materia_grupo INT  PRIMARY KEY,
                               id_profesor INT,
                               id_grupo INT,
                               id_materia INT,
                               FOREIGN KEY (id_profesor) REFERENCES profesores(id_profesor),
                               FOREIGN KEY (id_grupo) REFERENCES grupos(id_grupo),
                               FOREIGN KEY (id_materia) REFERENCES materias(id_materia)
);

CREATE TABLE inscripciones (
                               numero_cuenta INT,
                               id_materia_grupo INT,
                               PRIMARY KEY (numero_cuenta, id_materia_grupo),
                               FOREIGN KEY (numero_cuenta) REFERENCES alumnos(numero_cuenta),
                               FOREIGN KEY (id_materia_grupo) REFERENCES materia_grupo(id_materia_grupo)
);

-- Inserciones
INSERT INTO profesores (id_profesor, nombre, titulo, fecha_contratacion) VALUES
                                                                             (101, 'Ana Torres', 'Licenciada en Matemáticas', '2015-02-01'),
                                                                             (102, 'Luis Fernández', 'Doctor en Física', '2010-09-15'),
                                                                             (103, 'Sofía Morales', 'Ingeniera en Computación', '2018-06-20'),
                                                                             (104, 'Miguel Sánchez', 'Maestro en Química', '2012-11-10'),
                                                                             (105, 'Elena Ruiz', 'Doctora en Biología', '2016-04-25');

INSERT INTO materias (nombre, creditos) VALUES
                                            ('Matemáticas', 6),
                                            ('Física', 5),
                                            ('Programación Básica', 8),
                                            ('Química General', 4),
                                            ('Biología', 3);

INSERT INTO alumnos (numero_cuenta, nombre, apellido_paterno, apellido_materno, fecha_nacimiento) VALUES
                                                                                                      (35745, 'Juan', 'Pérez', 'Gómez', '2000-05-15'),
                                                                                                      (46921, 'María', 'López', 'Hernández', '1999-08-22'),
                                                                                                      (21596, 'Carlos', 'Martínez', 'Ramírez', '2001-03-10'),
                                                                                                      (45521, 'Laura', 'García', 'Núñez', '2002-07-18'),
                                                                                                      (97261, 'Pedro', 'Hernández', 'Ortiz', '2000-12-05');

INSERT INTO salones (nombre, capacidad) VALUES
                                            ('Aula 101', 30),
                                            ('Aula 102', 25);

INSERT INTO grupos (id_salon, semestre) VALUES
                                            (1, '2023-1'),
                                            (2, '2023-2');


--Queries


