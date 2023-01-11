/*
    Escreva um algoritmo em Portugol, que leia um valor com duas casas decimais, equivalente ao salário de uma pessoa.
    Em seguida, calcule e mostre o valor que esta pessoa deve pagar de Imposto de Renda ou Isento
*/

import java.util.Locale;
import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o salário: ");
        float sal = sc.nextFloat();

        if(!(sal > 0.00)){
            System.out.println("Digite um valor válido.");
        }else {
            if (sal > 0.00 && sal <= 2000.00) {
                System.out.println("Isento");
            } else if (sal >= 2000.01 && sal <= 3000.00) {
                System.out.printf("Imposto de Renda: %.2f", (8.00 / 100) * sal);
            } else if (sal >= 3000.01 && sal <= 4500.00) {
                System.out.printf("Imposto de Renda: %.2f", (18.00 / 100) * sal);
            } else {
                System.out.printf("Imposto de Renda: %.2f", (28.00 / 100) * sal);
            }
        }
    }
}
