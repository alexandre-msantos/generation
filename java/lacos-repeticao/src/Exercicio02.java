/*Escreva um algoritmo, que leia 2 números inteiros via teclado, onde o primeiro número deve ser menor
    do que o segundo número. Caso contrário, deve ser exibida uma mensagem na tela informando que o intervalo
    é inválido e sair do programa. Dentro do intervalo informado intervalo, mostre na tela todos os números
    que são múltiplos de 3 e 5
*/
import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int num1, num2;

    System.out.print("Digite o primeiro número do intervalo: ");
    num1 = sc.nextInt();
    System.out.print("Digite o segundo número do intervalo: ");
    num2 = sc.nextInt();

        if(!(num1 < num2)){
            System.out.println("Intervalo inválido!");
        }else {
            for (;num1 <= num2; num1++) {
                if (num1 % 5 == 0 && num1 % 3 == 0) {
                    System.out.println(num1 + " é multiplo de 5 e 3");
                }
            }
        }
    }
}
