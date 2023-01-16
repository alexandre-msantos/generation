/*Utilizando os conceitos de Classe, Objeto e Métodos, da Programação Orientada a Objetos, crie a Classe Ingresso
    com os seus respectivos Métodos e Atributos, que descreva o ingresso de um evento qualquer. Na sequência, crie
    uma Classe chamada TestaIngresso, instancie dois objetos da Classe Ingresso e apresente as informações
    destes 2 Objetos no console
*/
package br.com.exemplo.exercicio05;

public class TestaIngresso {
    public static void main(String[] args) {

        Ingresso ing1 = new Ingresso(01, "Filme - Avatar", "Inteira", 15, 20.00);
        Ingresso ing2 = new Ingresso(02, "Filme - Senhor dos Anéis", "Meia-Entrada", 25, 10.00);

        System.out.println(ing1);
        System.out.println(ing2);
    }
}
