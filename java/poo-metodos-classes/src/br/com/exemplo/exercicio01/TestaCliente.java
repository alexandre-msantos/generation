/*  Utilizando os conceitos de Classe, Objeto e Métodos, da Programação Orientada a Objetos, crie a Classe Cliente
    com os seus respectivos Métodos e Atributos. Na sequência, crie uma Classe chamada TestaCliente, instancie dois
    objetos da Classe Cliente e apresente as informações destes 2 Objetos no console.
*/
package br.com.exemplo.exercicio01;

import java.util.Scanner;

public class TestaCliente {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Cliente cliente1 = new Cliente(01, "Anna Silva", "012.345.678-00", 18, "65 99851-0000");
        Cliente cliente2 = new Cliente(02, "João Macedo", "123.456.789-02", 35, "97 99991-1234");

        System.out.println(cliente1);
        System.out.println(cliente2);
    }
}
