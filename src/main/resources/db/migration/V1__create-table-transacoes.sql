create table transacoes(
	id bigint not null auto_increment primary key,
	ticker varchar(7) not null,
	data date not null,
	preco decimal(19,2) not null,
	quantidade int not null,
	tipo varchar(50) not null
);
