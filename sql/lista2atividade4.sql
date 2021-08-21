create database db_cidade_das_frutas;

use db_cidade_das_frutas;

create table tb_categoria(
	id int not null auto_increment,
    nome varchar(50),
    dia_promocao varchar(10),
    primary key (id)
) engine=InnoDB;

create table tb_produto(
	id int not null auto_increment,
    nome varchar(50),
    preco_unitario decimal(6,2),
    estoque int(4),
    id_categoria int not null references tb_categoria(id),
    primary key (id)
) engine=InnoDB;

insert into tb_categoria(nome, dia_promocao) values ("Verduras","Segunda"), ("Frutas vermelhas","Quarta"), ("Legumes","Terça"), 
("Frutas cítricas","Sexta"), ("Disponíveis o ano todo","Quinta");
insert into tb_produto(nome, preco_unitario, estoque, id_categoria) values ("Alface",3.50,100,1), ("Morango (Bandeja)",10.00,100,2), ("Abobrinha",5.00,100,3),
("Laranja (Dúzia)",15.00,100,4), ("Banana (Dúzia)",12.00,100,5), ("Rúcula",6.00,100,1), ("Amora (Bandeja)",25.00,100,2), ("Cenoura",3.00,100,3);


select * from tb_produto where preco_unitario > 50.00;
select * from tb_produto where preco_unitario > 3.00 and preco_unitario < 60.00;
select * from tb_produto where nome like "%C%";

select * from tb_produto inner join tb_categoria on tb_categoria.id = tb_produto.id_categoria where tb_categoria.nome = "Legumes";

