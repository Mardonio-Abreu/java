-- Crear la base de datos

CREATE DATABASE vinilos_club;
USE vinilos_club;

-- Tabla: Cooperativistas
CREATE TABLE Cooperativistas (
    numero_cooperativista INT PRIMARY KEY,
    nombre VARCHAR(100),
    apellido_paterno VARCHAR(100),
    apellido_materno VARCHAR(100),
    correo_electronico VARCHAR(150),
    telefono VARCHAR(20)
);

-- Tabla: Articulos
CREATE TABLE Articulos (
    numero_articulo INT PRIMARY KEY,
    numero_cooperativista INT,
    categoria VARCHAR(100),
    nombre VARCHAR(100),
    descripcion VARCHAR(200),
    precio DECIMAL(10, 2),
    fotografias VARCHAR(50),
    FOREIGN KEY (numero_cooperativista) REFERENCES Cooperativistas(numero_cooperativista)
);

-- Tabla: Inventario
CREATE TABLE Inventario (
    numero_inventario INT,
    numero_articulo INT,
    articulos_disponibles INT,
    FOREIGN KEY (numero_articulo) REFERENCES Articulos(numero_articulo)
);


