create database bd_aula05;

use bd_aula05;

create table filmes
(
id bigint primary key auto_increment,
nome varchar(50),
descricao varchar(50),
preco double,
imagem varchar(255)
);

insert into filmes values 
(null, 'O Exterminador do Futuro', 'Acao', '20', 'https://br.web.img3.acsta.net/medias/nmedia/18/92/90/99/20224665.jpg');