SET NAMES 'utf8';
DROP DATABASE IF EXISTS tareasDB;
CREATE DATABASE IF NOT EXISTS tareasDB DEFAULT CHARACTER SET utf8;
USE tareasDB;

CREATE TABLE smartphone(
                        idmarca INTEGER NOT NULL AUTO_INCREMENT,
                        modelo VARCHAR(40) NOT NULL,
                        numero_de_serie INTEGER NOT NULL,
                        precio INTEGER NOT NULL, 
                        PRIMARY KEY(idmarca)
)DEFAULT CHARACTER SET utf8;

INSERT INTO tareasDB.smartphone (modelo, numero_de_serie, precio) VALUES ('Nokia', 465, 1500);
INSERT INTO tareasDB.smartphone (modelo, numero_de_serie, precio) VALUES ('Sony', 754, 1600);
INSERT INTO tareasDB.smartphone (modelo, numero_de_serie, precio) VALUES ('Samsung', 124, 1700);
INSERT INTO tareasDB.smartphone (modelo, numero_de_serie, precio) VALUES ('Apple', 159, 1800);
INSERT INTO tareasDB.smartphone (modelo, numero_de_serie, precio) VALUES ('Xiaomi', 456, 1900);
INSERT INTO tareasDB.smartphone (modelo, numero_de_serie, precio) VALUES ('Huawei', 854, 2000);
INSERT INTO tareasDB.smartphone (modelo, numero_de_serie, precio) VALUES ('Oppo', 145, 2100);
INSERT INTO tareasDB.smartphone (modelo, numero_de_serie, precio) VALUES ('Honor', 312, 2200);


