/*  Utilizando os conceitos de Classe, Objeto e Métodos, da Programação Orientada a Objetos, crie a Classe Produto
    com os seus respectivos Métodos e Atributos, que descreva os produtos de uma Loja de Games. Na sequência,
    crie uma Classe chamada TestaGame, instancie dois objetos da Classe Produto e apresente as informações destes
    2 Objetos no console.
*/
package br.com.exemplo.exercicio03;

public class TestaProduto {
    public static void main(String[] args) {

        Produto prod1 = new Produto(01, "PlayStation 5", "Console", "Sony", 4500.00);
        Produto prod2 = new Produto(02, "Fifa 23", "Jogo", "EA Games", 300.00);

        System.out.println(prod1);
        System.out.println(prod2);
    }
}
