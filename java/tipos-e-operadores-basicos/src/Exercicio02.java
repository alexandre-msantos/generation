/*Elabore um algoritmo que leia 4 notas de um participante, em variáveis do tipo real e exiba na tela a
    média final do participante.
 */

import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        float nota1f, nota2f, nota3f, nota4f, media;

        System.out.print("Nota 1: ");
        nota1f = sc.nextFloat();
        System.out.print("Nota 2: ");
        nota2f = sc.nextFloat();
        System.out.print("Nota 3: ");
        nota3f = sc.nextFloat();
        System.out.print("Nota 4: ");
        nota4f = sc.nextFloat();

        media = (nota1f + nota2f + nota3f + nota4f) / 4;

        System.out.printf("Média final: %.1f ", media);
    }
}
