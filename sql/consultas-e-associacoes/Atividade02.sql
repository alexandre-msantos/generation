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