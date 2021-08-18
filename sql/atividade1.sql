create database db_recursosHumanos;


use db_recursosHumanos;
create table funcionaries(
	id bigint(5) auto_increment,
    nome varchar(100) not null,
    salario decimal(10,2),
    departamento varchar(50),
    estaDeFerias boolean,
    primary key(id)
);


insert into funcionaries(nome, salario, departamento, estaDeFerias) values ("Letícia", 2000.00 ,"TI", false);
insert into funcionaries(nome, salario, departamento, estaDeFerias) values ("Felipe", 3000.00 ,"TI", false);
insert into funcionaries(nome, salario, departamento, estaDeFerias) values ("Fábio", 2500.00 ,"Marketing", true);
insert into funcionaries(nome, salario, departamento, estaDeFerias) values ("Giovanna", 4000.00 ,"RH", false);
insert into funcionaries(nome, salario, departamento, estaDeFerias) values ("Vinicius", 2000.00 ,"RH", false);

select * from funcionaries where salario <= 2000.00;
select * from funcionaries where salario > 2000.00;

update funcionaries set salario = 3000.00 where id = 1;

select * from funcionaries;