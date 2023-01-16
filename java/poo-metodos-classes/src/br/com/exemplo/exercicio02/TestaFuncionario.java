/*  Utilizando os conceitos de Classe, Objeto e Métodos, da Programação Orientada a Objetos, crie a Classe Funcionario
    com os seus respectivos Métodos e Atributos. Na sequência, crie uma Classe chamada TestaFuncionario, instancie dois
    objetos da Classe Funcionario e apresente as informações destes 2 Objetos no console.
*/
package br.com.exemplo.exercicio02;

public class TestaFuncionario {
    public static void main(String[] args) {

    Funcionario func1 = new Funcionario(01, "Diego Veríssimo", "001.002.003-00", "Gerente financeiro", 10000.00);
    Funcionario func2 = new Funcionario(02, "Aldo Nunes", "005.006.007-02", "Analista financeiro", 5000.00);

        System.out.println(func1);
        System.out.println(func2);

    }
}
