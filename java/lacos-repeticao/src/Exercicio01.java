/* Escreva um algoritmo, que leia um número inteiro via teclado entre 1 e 10 e mostre na tela a tabuada deste número.
    Utilize o Laço de Repetição enquanto para resolver o exercício.
   */
import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num, cont = 0;

        System.out.print("Digite um número de 1 a 10: ");
        num = sc.nextInt();

        if(num < 1 || num > 10){
            System.out.print("Digite um número válido.");
        }else {
            while (cont < 10){
                cont++;
                System.out.println(num + " x " + cont + " = " + num * cont);
            }
        }
    }
}
