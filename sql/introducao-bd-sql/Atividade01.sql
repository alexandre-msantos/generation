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