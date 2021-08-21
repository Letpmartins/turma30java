create database db_farmacia_do_bem;

use db_farmacia_do_bem;

create table tb_categoria(
	id_categoria int(5) not null auto_increment,
    nome varchar(30),
    em_promocao boolean,
    primary key (id_categoria)
) engine = InnoDB;

create table tb_produto(
	id_produto int(5) not null auto_increment,
    nome varchar(50),
    preco decimal(8,2),
    laboratorio varchar(50),
    id_categoria int(5) not null references tb_categoria(id_categoria),
    primary key (id_produto)
) engine = InnoDB;

insert into tb_categoria(nome, em_promocao) values ("Diversos",false),("Cosméticos",false),("Controlados",false),("Genéricos",true);
insert into tb_produto(nome, preco, laboratorio, id_categoria) values ("Busonid", 50.00,"Ache",1),("Protetor solar", 25.00,"Nivea",2),("Carbonato de Lítio", 65.00,"Eurofarma",3),
("Dipirona", 13.00,"Medley",4),("Salompas", 3.00,"Hisamitsu",1),("Creme anti-idade", 100.00,"Avon",2),("Creme de barbear", 40.00,"Bozzano",4);

select * from tb_produto where preco > 50.00;
select * from tb_produto where preco > 3.00 and preco < 60.00;
select * from tb_produto where nome like "%B%";

select * from tb_produto inner join tb_categoria on tb_categoria.id_categoria = tb_produto.id_categoria where tb_categoria.nome = "Diversos";