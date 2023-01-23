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





