/*
import java.util.Locale;
import java.util.Scanner;

public class ExerciciosGeral {

    //
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

    //
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

    //
    public class Exercicio03 {
        public static void main(String[] args) {
            Locale.setDefault(Locale.US);
            Scanner sc = new Scanner(System.in);

            int qntd, cod;
            float preco;

            System.out.println("==================================");
            System.out.println("       Tabela de pedidos");
            System.out.println("==================================");
            System.out.println();
            System.out.println(" 1 - Cachorro quente --- R$ 10.00");
            System.out.println(" 2 - X-Salada ---------- R$ 15.00");
            System.out.println(" 3 - X-Bacon  ---------- R$ 18.00");
            System.out.println(" 4 - Bauru    ---------- R$ 12.00");
            System.out.println(" 5 - Refrigerate -------- R$ 8.00");
            System.out.println(" 6 - Suco de Laranja---- R$ 15.00");
            System.out.println();

            System.out.print("Digite o código do produto: ");
            cod = sc.nextInt();
            System.out.print("Digite a quantidade desejada: ");
            qntd = sc.nextInt();
            System.out.println();

            switch (cod) {
                case 1:
                    System.out.printf(qntd + "x Cachorro quente -- Total: R$ %.2f ", 10.00 * qntd);
                    break;
                case 2:
                    System.out.printf(qntd + "x X-Salada -- Total: R$ %.2f", 15.00 * qntd);
                    break;
                case 3:
                    System.out.printf(qntd + "x X-Bacon -- Total: R$ %.2f ", 18.00 * qntd);
                    break;
                case 4:
                    System.out.printf(qntd + "x Bauru -- Total: R$ %.2f ", 12.00 * qntd);
                    break;
                case 5:
                    System.out.printf(qntd + "x Refrigerante -- Total: R$ %.2f ", 8.00 * qntd);
                    break;
                case 6:
                    System.out.printf(qntd + "x Suco de laranja -- Total: R$ %.2f ", 15.00 * qntd);
                    break;
            }

        }
    }

    //
    public class Exercicio04 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            System.out.print("Digite a idade: ");
            int idade = sc.nextInt();

            if(idade >= 16 && idade < 18){
                System.out.println("A pessoa está apta a votar e o voto é facultativo.");
            }else if(idade >= 18 && idade < 65){
                System.out.println("A pessoa está apta a votar e o voto é obrigatório.");
            }else if(idade >= 65){
                System.out.println("A pessoa está apta a votar e o voto é facultativo.");
            }else{
                System.out.println("A pessoa não está apta a votar.");
            }


        }
    }

    //
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

    //
    public class Exercicio06 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            System.out.print("Digite o primeiro nome: ");
            String nome1 = sc.next();
            System.out.print("Digite o segundo nome: ");
            String nome2 = sc.next();
            System.out.print("Digite o terceiro nome: ");
            String nome3 = sc.next();

            if(nome1.equals("vertebrado") && nome2.equals("ave") && nome3.equals("carnivoro")){
                System.out.println("Águia");
            }else if(nome1.equals("vertebrado") && nome2.equals("ave") && nome3.equals("onivoro")){
                System.out.println("Pomba");
            }else if(nome1.equals("vertebrado") && nome2.equals("mamifero") && nome3.equals("onivoro")){
                System.out.println("Homem");
            }else if(nome1.equals("vertebrado") && nome2.equals("mamifero") && nome3.equals("herbivoro")){
                System.out.println("Vaca");
            }else if(nome1.equals("invertebrado") && nome2.equals("inseto") && nome3.equals("hematofago")){
                System.out.println("Pulga");
            }else if(nome1.equals("invertebrado") && nome2.equals("inseto") && nome3.equals("herbivoro")){
                System.out.println("Largarta");
            }else if(nome1.equals("invertebrado") && nome2.equals("anelidio") && nome3.equals("hematofago")){
                System.out.println("Sanguessuga");
            }else if(nome1.equals("invertebrado") && nome2.equals("anelidio") && nome3.equals("onivoro")){
                System.out.println("Minhoca");
            }
        }
    }

}
*/