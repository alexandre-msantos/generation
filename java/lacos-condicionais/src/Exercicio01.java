import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o numro A: ");
        int a = sc.nextInt();
        System.out.print("Digite o numro B: ");
        int b = sc.nextInt();
        System.out.print("Digite o numro C: ");
        int c = sc.nextInt();

        if(a + b > c){
            System.out.println("A Soma de A + B é Maior do que C");
        }else if(a + b < c){
            System.out.println("A Soma de A + B é Menor do que C");
        }else {
            System.out.println("A Soma de A + B é Igual a C");
        }
    }
}
