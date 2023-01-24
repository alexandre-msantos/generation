-- ATIVIDADE NUNERO 1
CREATE DATABASE db_rh;

USE db_rh;

CREATE TABLE tb_colaboradores(
id BIGINT AUTO_INCREMENT PRIMARY KEY,
nome VARCHAR(250),
idade CHAR(3),
regime CHAR(3),
salario DECIMAL);

INSERT INTO tb_colaboradores(nome, idade, regime, salario) VALUES('Cristiano', 35, 'PJ', 10000.00);
INSERT INTO tb_colaboradores(nome, idade, regime, salario) VALUES('Maria', 27, 'CLT', 5000.00);
INSERT INTO tb_colaboradores(nome, idade, regime, salario) VALUES('Anna', 29, 'PJ', 7500.00);
INSERT INTO tb_colaboradores(nome, idade, regime, salario) VALUES('Ronaldo', 22, 'CLT', 1800.00);
INSERT INTO tb_colaboradores(nome, idade, regime, salario) VALUES('João', 25, 'CLT', 1675.00);

SELECT * FROM tb_colaboradores;
SELECT * FROM tb_colaboradores WHERE salario > 2000.00;
SELECT * FROM tb_colaboradores WHERE salario < 2000.00;

UPDATE tb_colaboradores SET salario = 2000.00 WHERE id = 1;

-- ATIVIDADE NUMERO 2
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

-- ATIVIDADE NUMERO 3
CREATE DATABASE db_escola;

USE db_escola;

CREATE TABLE tb_estudantes(
id BIGINT AUTO_INCREMENT PRIMARY KEY,
nome VARCHAR(250),
idade BIGINT(2),
turma VARCHAR(250),
nota DECIMAL);

INSERT INTO tb_estudantes(nome, idade, turma, nota) VALUES('Alex', 15, '2° Ano', 7.0);
INSERT INTO tb_estudantes(nome, idade, turma, nota) VALUES('Anna', 17, '3° Ano', 9.0);
INSERT INTO tb_estudantes(nome, idade, turma, nota) VALUES('Marcelo', 16, '2° Ano', 8.5);
INSERT INTO tb_estudantes(nome, idade, turma, nota) VALUES('Eva', 17, '3° Ano', 7.5);
INSERT INTO tb_estudantes(nome, idade, turma, nota) VALUES('Rômulo', 14, '1° Ano', 9.2);
INSERT INTO tb_estudantes(nome, idade, turma, nota) VALUES('Bruno', 14, '1° Ano', 5.2);
INSERT INTO tb_estudantes(nome, idade, turma, nota) VALUES('Angela', 15, '2° Ano', 5.5);
INSERT INTO tb_estudantes(nome, idade, turma, nota) VALUES('Renato', 17, '3° Ano', 8.0);

SELECT * FROM tb_estudantes;
SELECT * FROM tb_estudantes WHERE nota > 7.0;
SELECT * FROM tb_estudantes WHERE nota < 7.0;

UPDATE tb_estudantes SET nome = 'Luan' WHERE id = 6;