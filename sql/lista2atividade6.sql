create database db_cursoDaMinhaVida;

use db_cursoDaMinhaVida;

create table tb_categoria(
	id int not null auto_increment,
    nome varchar(50),
    completo boolean,
    primary key (id)
) engine=InnoDB;

create table tb_curso(
	id int not null auto_increment,
    nome varchar(50),
    duracao_horas int(3),
    preco decimal(8,2),
    id_categoria int not null references tb_categoria(id),
    primary key (id)
) engine=InnoDB;

insert into tb_categoria (nome, completo) values ("Programação", false), ("Línguas", true), ("Música", true), ("Artes", true);
insert into tb_curso (nome, duracao_horas, preco, id_categoria) values ("Dev Java Jr.", 480, 0.00 ,1), ("Espanhol", 200, 80.00, 2),("Aula de piano", 80, 50.00, 3), 
("Pintura na Casa de Cultura",20, 0.00 , 4), ("Ciência de dados com Python", 54, 40.00, 1);


select * from tb_curso where preco > 50.00;
select * from tb_curso where preco > 3.00 and preco < 60.00;
select * from tb_curso where nome like "%C%";

select * from tb_curso inner join tb_categoria on tb_categoria.id = tb_curso.id_categoria where tb_categoria.nome = "Programação";