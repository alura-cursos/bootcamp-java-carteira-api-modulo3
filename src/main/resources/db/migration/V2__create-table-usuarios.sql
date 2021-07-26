create table usuarios(
	id bigint not null auto_increment primary key,
	nome varchar(100) not null,
	login varchar(100) not null,
	senha varchar(256) not null
);
