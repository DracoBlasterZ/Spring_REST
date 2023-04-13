DROP table IF EXISTS empleados;

create table empleados(
	id int auto_increment,
	nombre varchar(250),
	trabajo varchar(250),
	salario integer
    
);

insert into empleados (id, nombre,trabajo,salario)values(203940,'Maurin','jardinero',2000);
insert into empleados (id, nombre,trabajo,salario)values(847924,'Lopez','programador',2500);
insert into empleados (id, nombre,trabajo,salario)values(354567,'Tulio','diseno',2300);
insert into empleados (id, nombre,trabajo,salario)values(134635,'Wester','jardinero',2000);
insert into empleados (id, nombre,trabajo,salario)values(246685,'Linda','programador',2500);