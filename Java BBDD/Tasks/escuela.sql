USE escuela;

-- Desactivar validación de claves foráneas temporalmente
SET FOREIGN_KEY_CHECKS = 0;

-- Eliminación segura de tablas
DROP TABLE IF EXISTS calificaciones;
DROP TABLE IF EXISTS inscripciones;
DROP TABLE IF EXISTS grupo_materia;
DROP TABLE IF EXISTS grupos;
DROP TABLE IF EXISTS salones;
DROP TABLE IF EXISTS materias;
DROP TABLE IF EXISTS profesores;
DROP TABLE IF EXISTS alumnos;

SET FOREIGN_KEY_CHECKS = 1;

-- Creación de tablas

CREATE TABLE alumnos (
    numero_cuenta INT PRIMARY KEY,
    nombre VARCHAR(50) NOT NULL,
    apellido_paterno VARCHAR(50) NOT NULL,
    apellido_materno VARCHAR(50) NOT NULL,
    fecha_nacimiento DATE NOT NULL
);

CREATE TABLE profesores (
    id_profesor INT PRIMARY KEY,
    nombre VARCHAR(50) NOT NULL,
    titulo VARCHAR(50) NOT NULL,
    fecha_contratacion DATE NOT NULL
);

CREATE TABLE materias (
    clave INT PRIMARY KEY AUTO_INCREMENT,
    nombre VARCHAR(50) NOT NULL,
    creditos INT NOT NULL
);

CREATE TABLE salones (
    id_salon INT PRIMARY KEY AUTO_INCREMENT,
    nombre VARCHAR(50) NOT NULL,
    capacidad INT NOT NULL
);

CREATE TABLE grupos (
    id_grupo INT PRIMARY KEY AUTO_INCREMENT,
    id_salon INT NOT NULL,
    semestre VARCHAR(10) NOT NULL,
    FOREIGN KEY (id_salon) REFERENCES salones(id_salon)
);

CREATE TABLE grupo_materia (
    id_grupo INT NOT NULL,
    clave INT NOT NULL,
    id_profesor INT NOT NULL,
    PRIMARY KEY (id_grupo, clave, id_profesor),
    FOREIGN KEY (id_profesor) REFERENCES profesores(id_profesor),
    FOREIGN KEY (id_grupo) REFERENCES grupos(id_grupo),
    FOREIGN KEY (clave) REFERENCES materias(clave)
);

CREATE TABLE inscripciones (
    numero_cuenta INT NOT NULL,
    id_grupo INT NOT NULL,
    PRIMARY KEY (numero_cuenta, id_grupo),
    FOREIGN KEY (numero_cuenta) REFERENCES alumnos(numero_cuenta),
    FOREIGN KEY (id_grupo) REFERENCES grupos(id_grupo)
);

CREATE TABLE calificaciones (
    numero_cuenta INT NOT NULL,
    clave INT NOT NULL,
    calificacion DECIMAL(3,2) NOT NULL,
    PRIMARY KEY (numero_cuenta, clave),
    FOREIGN KEY (numero_cuenta) REFERENCES alumnos(numero_cuenta),
    FOREIGN KEY (clave) REFERENCES materias(clave)
);

-- Inserción de datos

INSERT INTO alumnos (numero_cuenta, nombre, apellido_paterno, apellido_materno, fecha_nacimiento) VALUES
(35745, 'Juan', 'Pérez', 'Gómez', '2000-05-15'),
(46921, 'María', 'López', 'Hernández', '1999-08-22'),
(21596, 'Carlos', 'Martínez', 'Ramírez', '2001-03-10'),
(45521, 'Laura', 'García', 'Núñez', '2002-07-18'),
(97261, 'Pedro', 'Hernández', 'Ortiz', '2000-12-05');

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

INSERT INTO salones (nombre, capacidad) VALUES
('Aula 101', 30),
('Aula 102', 25);

INSERT INTO grupos (id_salon, semestre) VALUES
(1, '2023-1'),
(2, '2023-2');

INSERT INTO grupo_materia (id_grupo, clave, id_profesor) VALUES
(1, 1, 101),
(1, 2, 102),
(1, 3, 103),
(1, 4, 104),
(1, 5, 105),
(2, 1, 101),
(2, 2, 102),
(2, 3, 103),
(2, 4, 104),
(2, 5, 105);

INSERT INTO inscripciones (numero_cuenta, id_grupo) VALUES
(35745, 1),
(46921, 1),
(21596, 1),
(45521, 2),
(97261, 2);

INSERT INTO calificaciones (numero_cuenta, clave, calificacion) VALUES
(35745, 1, 8.5), (35745, 2, 9.0), (35745, 3, 7.5), (35745, 4, 8.0), (35745, 5, 9.2),
(46921, 1, 7.8), (46921, 2, 8.3), (46921, 3, 9.0), (46921, 4, 7.5), (46921, 5, 8.7),
(21596, 1, 9.1), (21596, 2, 8.6), (21596, 3, 7.9), (21596, 4, 8.4), (21596, 5, 9.3),
(45521, 1, 8.2), (45521, 2, 7.7), (45521, 3, 8.9), (45521, 4, 9.0), (45521, 5, 8.5),
(97261, 1, 7.5), (97261, 2, 8.0), (97261, 3, 9.2), (97261, 4, 8.8), (97261, 5, 7.9);