CREATE DATABASE agencia;

USE agencia;

CREATE TABLE Sucursal (
  nombre VARCHAR(50) PRIMARY KEY
);

CREATE TABLE Auto (
  placa VARCHAR(11) PRIMARY KEY,
  modelo VARCHAR(50) NOT NULL,
  anio INT NOT NULL, 
  sucursal_nombre VARCHAR(50), FOREIGN KEY (sucursal_nombre)  REFERENCES Sucursal(nombre) ON DELETE CASCADE ON UPDATE CASCADE
);

CREATE TABLE Pintura (
  color VARCHAR(20) NOT NULL,
  auto_placa VARCHAR(11),
  FOREIGN KEY (auto_placa) REFERENCES Auto(placa) ON DELETE CASCADE ON UPDATE CASCADE
);

alter table Pintura
    add constraint PK1 primary key(auto_placa);

CREATE TABLE Servicio (
  tipo VARCHAR(50) NOT NULL,
  pago DECIMAL(10,2) NOT NULL,
  presupuesto INT NOT NULL,
  auto_placa VARCHAR(11), FOREIGN KEY (auto_placa) REFERENCES Auto(placa) ON DELETE CASCADE ON UPDATE CASCADE
);

alter table Servicio
    add constraint PK2 primary key(auto_placa);