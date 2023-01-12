import java.util.Scanner;

public class Exercicio06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numeros, soma = 0;

        do{
            System.out.print("Digite um número: ");
            numeros = sc.nextInt();

            if(numeros > 0){
                soma += numeros;
            }
        }while(numeros != 0);
        System.out.println();
        System.out.println("A soma dos números positivos é: " + soma);
    }
}
