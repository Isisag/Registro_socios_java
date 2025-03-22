-- Creacion de BD
create database dulce_hogar;
use dulce_hogar;

-- Drop de tablas
-- drop table socio; 
-- drop table cuenta;

-- Creacion de objetos
create table socio (
rut varchar(20) primary key,
numero_socio INT,
nombre varchar(30),
appaterno varchar(30),
apmaterno varchar(30),
correo varchar(100),
domicilio varchar(100),
region varchar(30),
ciudad varchar(30),
comuna varchar(30),
telefono varchar(30)
);

create table cuenta (
rut varchar(20),
numero_socio int,
valor_cuota int,
cantidad_aportada int,
FOREIGN KEY (rut) REFERENCES socio(rut)
);
