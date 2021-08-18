create database db_ecommerce;

use db_recursosHumanos;
create table produtos(
	id bigint(8) auto_increment,
    nome varchar(30),
    marca varchar(30),
    valor decimal,
    qntd_estoque int,
    primary key(id)
);

insert into produtos(nome, marca, valor, qntd_estoque) values ("Tênis","Nike", 150.00, 50);
insert into produtos(nome, marca, valor, qntd_estoque) values ("Tênis de corrida","Nike", 200.00, 50);
insert into produtos(nome, marca, valor, qntd_estoque) values ("Agasalho","Nike", 350.00, 50);
insert into produtos(nome, marca, valor, qntd_estoque) values ("Carteira","Gucci", 550.00, 50);
insert into produtos(nome, marca, valor, qntd_estoque) values ("Bolsa","Gucci", 550.00, 50);
insert into produtos(nome, marca, valor, qntd_estoque) values ("Moletom","Uniqlo", 550.00, 50);
insert into produtos(nome, marca, valor, qntd_estoque) values ("Camisa","Uniqlo", 300.00, 50);
insert into produtos(nome, marca, valor, qntd_estoque) values ("Sobretudo","Uniqlo", 600.00, 50);


select * from produtos where valor <= 500.00;
select * from produtos where valor > 500.00;

update produtos set qntd_estoque = 40 where id = 4;

select * from produtos;
