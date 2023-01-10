/* Elabore um algoritmo que leia o Salário Bruto, o Adicional Noturno, as Horas Extras e os Descontos
   de um Colaborador, em variáveis do tipo real e exiba na tela o Salário Líquido
 */
import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        float salBruto, adNoturno, horasEx, descontos;

        System.out.print("Digite o salário: ");
        salBruto = sc.nextFloat();
        System.out.print("Informe o adicional noturno: ");
        adNoturno = sc.nextFloat();
        System.out.print("Informe a quantidade de horas extras: ");
        horasEx = sc.nextFloat();
        System.out.print("Informe o valor dos descontos: ");
        descontos = sc.nextFloat();

        System.out.printf("Salário líquido: %.2f", salBruto + adNoturno + (horasEx * 5) - descontos);
    }
}
