-- Crear la base de datos

CREATE DATABASE Vinilos_club;
USE Vinilos_club;

-- Tabla: Cooperativistas
CREATE TABLE Cooperativistas (
    numero_cooperativista INT PRIMARY KEY,
    nombre VARCHAR(100),
    apellido_paterno VARCHAR(100),
    apellido_materno VARCHAR(100),
    correo_electronico VARCHAR(150)
);


-- Tabla: Proveedores
CREATE TABLE Proveedores (
    numero_proveedor INT PRIMARY KEY,
    nombre VARCHAR(100),
    apellido_paterno VARCHAR(100),
    apellido_materno VARCHAR(100),
    correo_electronico VARCHAR(150)
);

-- Tabla: Clientes
CREATE TABLE Clientes (
    numero_cliente INT PRIMARY KEY,
    nombre VARCHAR(100),
    apellido_paterno VARCHAR(100),
    apellido_materno VARCHAR(100),
    correo_electronico VARCHAR(150)
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
    numero_articulo INT,
    articulos_disponibles INT,
    FOREIGN KEY (numero_articulo) REFERENCES Articulos(numero_articulo)
);

-- Tabla: Ventas
CREATE TABLE Ventas (
    numero_venta INT PRIMARY KEY,
    numero_cliente INT,
    numero_articulo INT,
    total DECIMAL(10,2),
    FOREIGN KEY (numero_cliente) REFERENCES Clientes(numero_cliente)
);

-- Tabla: Adquisiciones
CREATE TABLE Adquisiciones (
    numero_adquisicion INT PRIMARY KEY,
    numero_articulo INT,
    numero_proveedor INT
    );

-- Tabla: Intercambios
CREATE TABLE Intercambios (
    numero_intercambio INT PRIMARY KEY,
    numero_articulo INT,
    FOREIGN KEY (numero_articulo) REFERENCES Articulos(numero_articulo),
    FOREIGN KEY (numero_articulo) REFERENCES Articulos(numero_articulo)
);

-- Tabla: Devoluciones
CREATE TABLE Devoluciones (
    numero_venta INT,
    FOREIGN KEY (numero_venta) REFERENCES Ventas(numero_venta),
    motivo VARCHAR(100)
);

-- abla: Mermas
CREATE TABLE Mermas (
  numero_articulo INT,
  FOREIGN KEY (numero_articulo) REFERENCES Articulos(numero_articulo),
  motivo VARCHAR(100)
);






