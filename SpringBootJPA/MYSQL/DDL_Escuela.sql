-- creamos base de datos
create database escuela;
-- indicamos que vamos a usar ese
use escuela;
-- creamos tabla
/*
	tipos que hay:
		- int, tipo entero
        - varchar(45), tipo cadena o string, no es necesario llegar hasta 45 solo que este en ese rango la cadena
        - date, tipo fecha yyyy/mm/dd o aaaa/mm/dd
        - datetime, tipo fecha con tiempo
        - char(5), tipo string o cadena, pero que si o si requiere la longitud que le des
*/
create table alumnos(
	idalumnos int primary key auto_increment not null,
    cedula varchar(11),
    nombres varchar(45),
    apellidos varchar(45),
    curso varchar(45)
);