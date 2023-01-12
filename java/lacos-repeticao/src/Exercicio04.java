/*  Escreva um algoritmo, que leia a idade de várias pessoas (números inteiros), via teclado e mostre na
    tela o total de pessoas cuja idade seja menor do que 21 anos e o total de pessoas cuja idade seja maior
    do que 50 anos. A leitura dos dados deve ser finalizada ao digitar uma idade negativa.
*/
import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int idade = 0, contXXI = 0, contL = 0;

        while (idade >= 0) {
            System.out.print("Digite uma idade: ");
            idade = sc.nextInt();

            if (idade < 21 && idade > 0) {
                contXXI++;
            } else if (idade > 50) {
                contL++;
            }
        }
        System.out.println("Total de pessoas menores de 21 anos: " + contXXI);
        System.out.println("Total de pessoas maiores de 50 anos: " + contL);
    }
}
