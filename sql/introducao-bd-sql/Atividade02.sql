CREATE DATABASE db_ecommerce;

USE db_ecommerce;

CREATE TABLE tb_produtos(
id BIGINT AUTO_INCREMENT PRIMARY KEY,
nome VARCHAR(250),
marca VARCHAR(250),
quantidade int(50),
preco DECIMAL
);

INSERT INTO tb_produtos(nome, marca, quantidade, preco) VALUES('Galaxy A53', 'Samsung', 2, 1680.00);
INSERT INTO tb_produtos(nome, marca, quantidade, preco) VALUES('Galaxy A73', 'Samsung', 1, 2980.00);
INSERT INTO tb_produtos(nome, marca, quantidade, preco) VALUES('Galaxy S21', 'Samsung', 2, 4000.00);
INSERT INTO tb_produtos(nome, marca, quantidade, preco) VALUES('Carregador', 'Samsung', 4, 250.00);
INSERT INTO tb_produtos(nome, marca, quantidade, preco) VALUES('Carregador', 'Apple', 2, 400.00);
INSERT INTO tb_produtos(nome, marca, quantidade, preco) VALUES('Capa Protetora', 'Iplast', 2, 100.00);
INSERT INTO tb_produtos(nome, marca, quantidade, preco) VALUES('Iphone 12', 'Apple', 2, 3680.00);
INSERT INTO tb_produtos(nome, marca, quantidade, preco) VALUES('Iphone 13', 'Apple', 3, 6560.00);

SELECT * FROM tb_produtos;
SELECT * FROM tb_produtos WHERE preco > 500;
SELECT * FROM tb_produtos WHERE preco < 500;

UPDATE tb_produtos SET quantidade = 1 WHERE id = 8;