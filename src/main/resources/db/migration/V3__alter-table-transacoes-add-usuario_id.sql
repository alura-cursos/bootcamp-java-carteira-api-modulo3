alter table transacoes add column usuario_id bigint not null;
alter table transacoes add foreign key(usuario_id) references usuarios(id);
