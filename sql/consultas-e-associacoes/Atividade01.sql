-- ATIVIDADE NUNERO 1
CREATE DATABASE db_generation_game_online;

USE db_generation_game_online;

CREATE TABLE tb_classes(
id BIGINT AUTO_INCREMENT PRIMARY KEY,
classe VARCHAR(250)
);

CREATE TABLE tb_personagens(
id BIGINT AUTO_INCREMENT PRIMARY KEY,
nome_do_personagem VARCHAR(250),
ataque INT(5),
defesa INT(5),
stamina VARCHAR(250),
classes_id BIGINT,
CONSTRAINT FOREIGN KEY (classes_id) REFERENCES tb_classes(id)
);

INSERT INTO tb_classes(classe) VALUES ('Arqueiro');
INSERT INTO tb_classes(classe) VALUES ('Alquimista');
INSERT INTO tb_classes(classe) VALUES ('Apelao');
INSERT INTO tb_classes(classe) VALUES ('Humano');
INSERT INTO tb_classes(classe) VALUES ('Magia');

INSERT INTO tb_personagens(nome_do_personagem, ataque, defesa, stamina, classes_id) VALUES ('Oliver Queen', 900, 2500, 1200, 1);
INSERT INTO tb_personagens(nome_do_personagem, ataque, defesa, stamina, classes_id) VALUES ('Mestre dos Magos', 1200, 1100, 800, 3);
INSERT INTO tb_personagens(nome_do_personagem, ataque, defesa, stamina, classes_id) VALUES ('Bruxa dos Mares', 1000, 1000, 700, 2);
INSERT INTO tb_personagens(nome_do_personagem, ataque, defesa, stamina, classes_id) VALUES ('Gavião Arqueiro', 6500, 8500, 900, 1);
INSERT INTO tb_personagens(nome_do_personagem, ataque, defesa, stamina, classes_id) VALUES ('Goku', 80000, 45000, 1000, 3);
INSERT INTO tb_personagens(nome_do_personagem, ataque, defesa, stamina, classes_id) VALUES ('Saitama', 99000, 99000, 1000, 3);
INSERT INTO tb_personagens(nome_do_personagem, ataque, defesa, stamina, classes_id) VALUES ('Batman', 2500, 1000, 1900, 4);
INSERT INTO tb_personagens(nome_do_personagem, ataque, defesa, stamina, classes_id) VALUES ('Homem-Aranha', 1900, 1700, 900, 4);

SELECT * FROM tb_personagens;
SELECT * FROM tb_personagens WHERE ataque > 2000;
SELECT * FROM tb_personagens WHERE defesa BETWEEN 1000 AND 2000;
SELECT * FROM tb_personagens WHERE nome_do_personagem LIKE "B%";

SELECT * FROM tb_personagens INNER JOIN tb_classes ON tb_classes.id = tb_personagens.classes_id;
SELECT * FROM tb_personagens INNER JOIN tb_classes ON tb_classes.id = tb_personagens.classes_id WHERE classes_id = 3;