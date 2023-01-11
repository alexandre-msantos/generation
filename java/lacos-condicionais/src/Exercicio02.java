import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int numero = sc.nextInt();

        if(numero % 2 == 0 && numero > 0){
            System.out.print("O número " + numero + " é par e positivo");
        }else if(numero % 2 != 0 && numero > 0){
            System.out.print("O número " + numero + " é ímpar e positivo");
        }else if(numero % 2 == 0 && numero < 0){
        System.out.print("O número " + numero + " é par e negativo");
        }else if(numero % 2 != 0 && numero < 0){
        System.out.print("O número " + numero + " é ímpar e negativo");
        }
    }
}
