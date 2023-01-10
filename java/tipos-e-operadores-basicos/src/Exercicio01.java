import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
        //Dado o Fluxograma abaixo, desenvolva o algoritmo
        Scanner sc = new Scanner(System.in);

        float salariof, abonof;

        System.out.print("Digite o salário: ");
        salariof = sc.nextFloat();
        System.out.print("Digite o abono: ");
        abonof = sc.nextFloat();

        System.out.printf("Novo Salário: %.2f", salariof + abonof);
    }
}
