use academia;
INSERT INTO treino(nome_treino) VALUES("Supino reto com barra");
INSERT INTO treino(nome_treino) VALUES("Supino inclinado com halter");
INSERT INTO treino(nome_treino) VALUES("Peck Deck");
INSERT INTO treino(nome_treino) VALUES("Crossover com pegada alta");
INSERT INTO treino(nome_treino) VALUES("Elevação lateral com halter");
INSERT INTO treino(nome_treino) VALUES("Levantamento frontal com halter");
INSERT INTO treino(nome_treino) VALUES("Peck Deck invertido");
INSERT INTO treino(nome_treino) VALUES("Rosca direta com barra");
INSERT INTO treino(nome_treino) VALUES("Rosca alternada com halter");
INSERT INTO treino(nome_treino) VALUES("Rosca martelo com halter");
INSERT INTO treino(nome_treino) VALUES("Rosca com halter no banco inclinado");
INSERT INTO treino(nome_treino) VALUES("Rosca no banco Scott com a barra W");
INSERT INTO treino(nome_treino) VALUES("Extensão de halter sob a cabeça");
INSERT INTO treino(nome_treino) VALUES("Extensão de halter sob a cabeça alternado");
INSERT INTO treino(nome_treino) VALUES("Tríceps na maquina");
INSERT INTO treino(nome_treino) VALUES("Polia alta com corda");
INSERT INTO treino(nome_treino) VALUES("Puxada frontal");
INSERT INTO treino(nome_treino) VALUES("Pulley articulado");
INSERT INTO treino(nome_treino) VALUES("Remada cavalinho");
INSERT INTO treino(nome_treino) VALUES("Barra fixa");
INSERT INTO treino(nome_treino) VALUES("Agachamento");
INSERT INTO treino(nome_treino) VALUES("Leg Press 45 graus");
INSERT INTO treino(nome_treino) VALUES("Cadeira extensora");
INSERT INTO treino(nome_treino) VALUES("Cadeira flexora");
INSERT INTO treino(nome_treino) VALUES("Panturrilha");
INSERT INTO treino(nome_treino) VALUES("Cadeira abdutora");
INSERT INTO treino(nome_treino) VALUES("Cadeira adutora");
select * from treino;

drop table funcionario;

CREATE TABLE treino(
	id long,
    nome_treino varchar(100)
);

CREATE TABLE personal(
id long,
nome varchar(100),
email varchar(100),
cpf varchar(100),
senha varchar(100),
dt_nascimento date,
horarios_disp varchar(50),
cep long,
estado varchar(100),
cidade varchar(100),
logradouro varchar(100),
bairro varchar(100),
numero long
);

CREATE TABLE usuario(
id long,
nome varchar(100),
email varchar(100),
cpf varchar(100),
senha varchar(100),
dt_nascimento date,
peso double
);
alter table treino add primary key(id);
alter table funcionario add primary key (id);
ALTER TABLE personal ADD CONSTRAINT `fk_personal_nome_treino` FOREIGN KEY ( nome_treino ) REFERENCES treino ( nome_treino );



