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

-- ATIVIDADE NUMERO 2
CREATE DATABASE db_pizzaria_legal;

USE db_pizzaria_legal;

CREATE TABLE tb_categorias(
id BIGINT AUTO_INCREMENT PRIMARY KEY,
tipo VARCHAR(250)
);

CREATE TABLE tb_pizzas(
id BIGINT AUTO_INCREMENT PRIMARY KEY,
sabor VARCHAR(50),
tamanho VARCHAR(25),
descricao VARCHAR(250),
preco DECIMAL(5),
categoria_id BIGINT,
CONSTRAINT FOREIGN KEY (categoria_id) REFERENCES tb_categorias(id)
);

INSERT INTO tb_categorias(tipo) VALUES ('Salgada');
INSERT INTO tb_categorias(tipo) VALUES ('Doce');

INSERT INTO tb_pizzas(sabor, tamanho, descricao, preco, categoria_id) VALUES ('Calabresa', 'Grande', 'Pizza feita na hora', 50.00, 1);
INSERT INTO tb_pizzas(sabor, tamanho, descricao, preco, categoria_id) VALUES ('Paulista', 'Grande', 'Pizza feita na hora', 50.00, 1);
INSERT INTO tb_pizzas(sabor, tamanho, descricao, preco, categoria_id) VALUES ('Marguerita', 'Grande', 'Pizza feita na hora', 50.00, 1);
INSERT INTO tb_pizzas(sabor, tamanho, descricao, preco, categoria_id) VALUES ('Muçarela', 'Pequena', 'Pizza feita na hora', 20.00, 1);
INSERT INTO tb_pizzas(sabor, tamanho, descricao, preco, categoria_id) VALUES ('Lobinho', 'Média', 'Pizza feita na hora', 30.00, 1);
INSERT INTO tb_pizzas(sabor, tamanho, descricao, preco, categoria_id) VALUES ('Bacon Especial', 'Pequena', 'Pizza feita na hora', 20.00, 1);
INSERT INTO tb_pizzas(sabor, tamanho, descricao, preco, categoria_id) VALUES ('Banana', 'Média', 'Pizza feita na hora', 30.00, 2);
INSERT INTO tb_pizzas(sabor, tamanho, descricao, preco, categoria_id) VALUES ('Brigadeiro', 'Pequena', 'Pizza feita na hora', 25.00, 2);

SELECT * FROM tb_pizzas WHERE preco > 45.00;
SELECT * FROM tb_pizzas WHERE preco BETWEEN 50.00 AND 100.00;
SELECT * FROM tb_pizzas WHERE sabor LIKE "%M%";
SELECT * FROM tb_pizzas INNER JOIN tb_categorias ON tb_categorias.id = tb_pizzas.categoria_id;
SELECT * FROM tb_pizzas INNER JOIN tb_categorias ON tb_categorias.id = tb_pizzas.categoria_id WHERE categoria_id = 2;

-- ATIVIDADE NUMERO 3
CREATE DATABASE db_farmacia_bem_estar;

USE db_farmacia_bem_estar;

CREATE TABLE tb_categorias(
id BIGINT AUTO_INCREMENT PRIMARY KEY,
tipo VARCHAR(250)
);

CREATE TABLE tb_produtos(
id BIGINT AUTO_INCREMENT PRIMARY KEY,
nome VARCHAR(250),
marca VARCHAR(250),
qnt INT(3),
preco DECIMAL(5),
categoria_id BIGINT(3),
CONSTRAINT FOREIGN KEY(categoria_id) REFERENCES tb_categorias(id)
);

INSERT INTO tb_categorias(tipo) VALUES('Medicamentos');
INSERT INTO tb_categorias(tipo) VALUES('Produtos de Beleza');
INSERT INTO tb_categorias(tipo) VALUES('Suplementos');
INSERT INTO tb_categorias(tipo) VALUES('Produtos de Higiene');
INSERT INTO tb_categorias(tipo) VALUES('Outros');

INSERT INTO tb_produtos(nome, marca, qnt, preco, categoria_id) VALUES('Algodão', 'Topaiz', 20, 3.00, 5);
INSERT INTO tb_produtos(nome, marca, qnt, preco, categoria_id) VALUES('Tintura para Cabelo', 'Wella', 10, 13.00, 2);
INSERT INTO tb_produtos(nome, marca, qnt, preco, categoria_id) VALUES('Dorflex', 'Dor', 30, 4.00, 1);
INSERT INTO tb_produtos(nome, marca, qnt, preco, categoria_id) VALUES('Bastonete de algodão', 'Cotonetes', 20, 5.00, 4);
INSERT INTO tb_produtos(nome, marca, qnt, preco, categoria_id) VALUES('Dipirona', 'Medley', 14, 8.00, 1);
INSERT INTO tb_produtos(nome, marca, qnt, preco, categoria_id) VALUES('Medidor de pressão', 'Omiron', 10, 80.00, 5);
INSERT INTO tb_produtos(nome, marca, qnt, preco, categoria_id) VALUES('Whey Protein', 'Max Titanium', 12, 203.00, 3);
INSERT INTO tb_produtos(nome, marca, qnt, preco, categoria_id) VALUES('Creatina', 'ON', 10, 123.00, 3);

SELECT * FROM tb_categorias;
SELECT * FROM tb_produtos WHERE preco > 50.00;
SELECT * FROM tb_produtos WHERE preco BETWEEN 5.00 AND 60.00;
SELECT * FROM tb_produtos WHERE nome LIKE "%C%";
SELECT * FROM tb_produtos INNER JOIN tb_categorias ON tb_categorias.id = tb_produtos.categoria_id;
SELECT * FROM tb_produtos INNER JOIN tb_categorias ON tb_categorias.id = tb_produtos.categoria_id WHERE categoria_id = 3;