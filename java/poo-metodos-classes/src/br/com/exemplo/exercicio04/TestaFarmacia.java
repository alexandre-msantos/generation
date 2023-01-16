/*  Utilizando os conceitos de Classe, Objeto e Métodos, da Programação Orientada a Objetos, crie a Classe Farmacia
    com os seus respectivos Métodos e Atributos, que descreva os produtos de uma Farmácia. Na sequência, crie
    uma Classe chamada TestaFarmacia, instancie dois objetos da Classe Farmacia e apresente as informações destes
    2 Objetos no console.
*/
package br.com.exemplo.exercicio04;

public class TestaFarmacia {
    public static void main(String[] args) {

        Farmacia prod1 = new Farmacia(01, "Xarope", "Xaropil", "Medicamento", 12.00);
        Farmacia prod2 = new Farmacia(02, "Shampoo", "Dove", "Produto de higiene", 18.00);

        System.out.println(prod1);
        System.out.println(prod2);
    }
}
