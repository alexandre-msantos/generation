import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
        //Dado o Fluxograma abaixo, desenvolva o algoritmo

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o salário: ");
        float salario = sc.nextFloat();
        System.out.print("Digite o abono: ");
        float abono = sc.nextFloat();

        System.out.printf("Novo Salário: %.2f", salario + abono);
    }
}
