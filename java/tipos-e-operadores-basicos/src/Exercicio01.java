import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
        //Dado o Fluxograma abaixo, desenvolva o algoritmo

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o salário: ");
        double salario = sc.nextDouble();
        System.out.print("Digite o abono: ");
        double abono = sc.nextDouble();

        System.out.printf("Novo Salário: %.2f", salario + abono);
    }
}
