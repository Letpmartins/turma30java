create database db_escola;

use db_escola;
create table alunos(
	id bigint(8) auto_increment,
    nome varchar(100) not null,
    turma varchar(100),
    periodo varchar(20),
    nota decimal(2,1),
    primary key (id)
);

insert into alunos(nome, turma, periodo, nota) values ("Letícia","Java","Diurno", 7.8);
insert into alunos(nome, turma, periodo, nota) values ("Sabrina","Java","Noturno", 5.0);
insert into alunos(nome, turma, periodo, nota) values ("Matheus","Java","Diurno", 6.5);
insert into alunos(nome, turma, periodo, nota) values ("Rafael","C","Diurno", 8.5);
insert into alunos(nome, turma, periodo, nota) values ("Isabela","C","Noturno", 4.0);
insert into alunos(nome, turma, periodo, nota) values ("Felipe","Python","Noturno", 10.0);
insert into alunos(nome, turma, periodo, nota) values ("Camila","Python","Diurno", 5.9);
insert into alunos(nome, turma, periodo, nota) values ("Danilo","Python","Noturno", 7.5);


select * from alunos where nota < 7;
select * from alunos where nota >= 7;

update alunos set nota = 8.0 where id = 7;

select * from alunos;