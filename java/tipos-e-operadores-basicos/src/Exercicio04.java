/* Leia quatro valores inteiros (numero1, numero2, numero3 e numero4). A seguir, calcule e mostre a
   diferença do produto entre o numero1 e o numero2 pelo produto entre o numero3 e o numero4
 */
import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num1, num2, num3, num4;

        System.out.print("Numero 1: ");
        num1 = sc.nextInt();
        System.out.print("Numero 2: ");
        num2 = sc.nextInt();
        System.out.print("Numero 3: ");
        num3 = sc.nextInt();
        System.out.print("Numero 4: ");
        num4 = sc.nextInt();

        System.out.print("Diferença: " + ((num1 * num2) - (num3 * num4)));
    }
}