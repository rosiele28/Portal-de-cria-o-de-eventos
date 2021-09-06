CREATE TABLE portal.usuario
(
	id bigserial NOT NULL PRIMARY KEY,
	nome_completo CHARACTER varying(150),
	apelido CHARACTER varying(50),
	email CHARACTER varying(100),
	senha CHARACTER varying(20)
);

CREATE TABLE portal.eventos
(
	id bigserial NOT NULL PRIMARY KEY,
	nome_descrição CHARACTER varying(200),
	data_cadastro DATE DEFAULT now(),
	hora CHARACTER varying(20),
	local_endereço CHARACTER varying(200),
	id_usuario bigint REFERENCES portal.usuario (id)
	
)