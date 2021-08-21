create database db_pizzaria_legal;

use db_pizzaria_legal;

create table tb_categoria(
	id_categoria int(5) not null auto_increment,
    nome varchar(15),
    tipo_massa varchar(10) check(tipo_massa in ("Normal", "Fina")),
    primary key(id_categoria)
) engine=InnoDB;

create table tb_pizza(
	id_pizza int(5) not null auto_increment,
    nome varchar(50),
    tamanho char(1) check(tamanho in ('P','M','G')),
    preco decimal(5,2),
    id_categoria int(5) not null references tb_categoria(id_categoria),
    primary key (id_pizza)
) engine=InnoDB;

insert into tb_categoria(nome, tipo_massa) values ("Normal", "Normal"), ("Doce","Fina"), ("Especial", "Fina"), ("Calzone", "Normal");
insert into tb_pizza(nome, tamanho, preco, id_categoria) values ("Mussarela", 'G', 25.0, 1),("Frango c/ catupiry", 'M', 29.0, 1),("Brigadeiro", 'P', 35.0, 2),
("Banana com chocolate", 'P', 39.0, 2), ("Palmito com presunto Parma", 'G', 79.0, 3),("Calabresa", 'M', 20.0, 4);

select * from tb_pizza where preco > 29.0 and preco < 69.0;
select * from tb_pizza where nome like "%C%";

select * from tb_pizza inner join tb_categoria on tb_categoria.id_categoria = tb_pizza.id_categoria where tb_categoria.nome = "Doce";