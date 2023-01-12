   /* Escreva um algoritmo, que leia 10 números inteiros via teclado e mostre na tela
      quantos números são pares e quantos número são ímpares.
   */
import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int contPar = 0, contImpar = 0;

        for(int i = 0; i < 10; i++){
            System.out.print("Digite o " + (i+1) + "º número: ");
            int num = sc.nextInt();

            if(num % 2 == 0){
                contPar++;
            }else{
                contImpar++;
            }
        }
        System.out.println();
        System.out.println("Total de números pares:" + contPar);
        System.out.println("Total de números ímpares:" + contImpar);
    }
}
