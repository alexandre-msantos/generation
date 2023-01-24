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