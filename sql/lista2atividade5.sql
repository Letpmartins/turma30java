create database db_construindo_a_nossa_vida;

use db_construindo_a_nossa_vida;

create table tb_categoria(
	id int not null auto_increment,
    nome varchar(50),
    tem_subcategoria boolean,
    primary key (id)
) engine=InnoDB;

create table tb_produto(
	id int not null auto_increment,
    nome varchar(50),
    preco decimal(6,2),
    marca varchar(50),
    id_categoria int not null references tb_categoria(id),
    primary key (id)
) engine=InnoDB;

insert into tb_categoria(nome, tem_subcategoria) values ("Pisos e Revestimentos",true), ("Tintas",true), ("Hidráulica",true);
insert into tb_produto(nome, preco, marca, id_categoria) values ("Porcelanato", 50.00, "Piemonte", 1), ("Tinta a base de óleo", 20.00, "Suvinil", 2), ("Cano pvc", 30.00, "Tigre", 3),
("Pastinha", 40.00, "Real", 1), ("Tinta limpa fácil", 35.00, "Suvinil", 2), ("Bomba de água", 600.00, "Dancor", 3), ("Azulejo", 45.00, "Formigres", 1), ("Tinta a base de água", 15.00, "Suvinil", 2);

select * from tb_produto where preco > 50.00;
select * from tb_produto where preco > 3.00 and preco < 60.00;
select * from tb_produto where nome like "%C%";

select * from tb_produto inner join tb_categoria on tb_categoria.id = tb_produto.id_categoria where tb_categoria.nome = "Hidráulica";