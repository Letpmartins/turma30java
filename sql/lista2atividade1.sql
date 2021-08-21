create database db_generation_game_online;
use db_generation_game_online;

create table tb_classe(
	id_classe int(5) not null auto_increment,
    nome varchar(15),
    habilidade_chave varchar(20),
    magia boolean,
    primary key (id_classe)
) engine = InnoDB;

create table tb_personagem (
	id_personagem int(8) not null auto_increment,
    nome varchar(30),
    nivel tinyint,
    vida int(8),
    ataque int(10),
    defesa int(10),
    id_classe int(5) not null,
    primary key (id_personagem),
    foreign key(id_classe) references tb_classe(id_classe)
) engine=InnoDB;

insert into tb_classe(nome, habilidade_chave, magia) values ("Bardo", "Carisma", true), ("Lutador", "Nenhuma", false),("Mago","Inteligência", true);
insert into tb_personagem(nome, nivel, vida, ataque, defesa, id_classe) values ("Stybil Lanra", 1, 200, 15, 15, 2),("Crimsol Tymal", 50, 5000, 1900, 2600, 2),
("Walto Grufft", 30, 1500, 150, 150, 1), ("Nolqueir Venhora", 40, 4000, 2300, 1900, 3),("Dyvid Bramwell", 7, 300, 50, 200, 2);

select * from tb_personagem where ataque > 2000;
select * from tb_personagem where defesa > 1000 and defesa < 2000;
select * from tb_personagem where nome like "%C%";

select * from tb_personagem inner join tb_classe on tb_classe.id_classe = tb_personagem.id_classe where tb_classe.nome = "Mago";