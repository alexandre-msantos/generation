import java.util.Scanner;

public class Exercicio07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numero, cont = 0;
        float soma = 0f;

        do{
            System.out.print("Digite um número: ");
            numero = sc.nextInt();

            if(numero % 3 == 0 && numero != 0){
                cont++;
                soma += numero;
                //media = soma / cont;

                System.out.println(cont);
            }
        }while(numero != 0);
        System.out.println();
        System.out.print("A média de todos os números múltiplos de 3 é: " + String.format("%.1f", (soma / cont)));
    }
}
