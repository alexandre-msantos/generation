/*  Utilizando os conceitos de Classe, Objeto e Métodos, da Programação Orientada a Objetos, crie a Classe Curso com os
    seus respectivos Métodos e Atributos, que descreva um Curso qualquer, de uma Plataforma EAD. Na sequência, crie uma
    Classe chamada TestaCurso, instancie dois objetos da Classe Curso e apresente as informações destes 2 Objetos
    no console.
*/
package br.com.exemplo.exercicio06;

public class TestaCurso {
    public static void main(String[] args) {

        Curso curso1 = new Curso(01, "lingua Inglesa", "Idiomas", "Paulo Machado", 200.00);
        Curso curso2 = new Curso(02, "Java Básico", "Programação", "Bruna Peixoto", 300.00);

        System.out.println(curso1);
        System.out.println(curso2);
    }
}
