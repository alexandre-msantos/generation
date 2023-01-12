/*
import java.util.Scanner;

public class ExerciciosGerais {
    public class Exercicio01 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int num, cont = 0;

            System.out.print("Digite um número de 1 a 10: ");
            num = sc.nextInt();

            if(num < 1 || num > 10){
                System.out.print("Digite um número válido.");
            }else {
                while (cont < 10){
                    cont++;
                    System.out.println(num + " x " + cont + " = " + num * cont);
                }
            }
        }
    }

    //
    public class Exercicio02 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            int num1, num2;

            System.out.print("Digite o primeiro número do intervalo: ");
            num1 = sc.nextInt();
            System.out.print("Digite o segundo número do intervalo: ");
            num2 = sc.nextInt();

            if(!(num1 < num2)){
                System.out.println("Intervalo inválido!");
            }else {
                for (;num1 <= num2; num1++) {
                    if (num1 % 5 == 0 && num1 % 3 == 0) {
                        System.out.println(num1 + " é multiplo de 5 e 3");
                    }
                }
            }
        }
    }

    //
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

    //
    public class Exercicio04 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            int idade = 0, contXXI = 0, contL = 0;

            while (idade >= 0) {
                System.out.print("Digite uma idade: ");
                idade = sc.nextInt();

                if (idade < 21 && idade > 0) {
                    contXXI++;
                } else if (idade > 50) {
                    contL++;
                }
            }
            System.out.println("Total de pessoas menores de 21 anos: " + contXXI);
            System.out.println("Total de pessoas maiores de 50 anos: " + contL);
        }
    }

    //
    public class Exercicio05 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            char novo = 's';
            int contBack = 0, contMFront = 0, contMFull = 0, contHMob = 0;

            do{
                System.out.print("Digite a idade: ");
                int idade = sc.nextInt();

                System.out.println("-----------------------------");
                System.out.println("1 - Masculino");
                System.out.println("2 - Feminino");
                System.out.println("3 - Outros");
                System.out.println("-----------------------------");
                System.out.print("Escolha uma opção acima: ");
                int sexo = sc.nextInt();

                System.out.println("-----------------------------");
                System.out.println("1 - Backend");
                System.out.println("2 - Frontend");
                System.out.println("3 - Mobile");
                System.out.println("4 - FullStack");
                System.out.println("-----------------------------");
                System.out.print("Escolha uma categoria: ");
                int cat = sc.nextInt();

                if(cat == 1){
                    contBack++;
                }else if(sexo == 2 && cat == 2){
                    contMFront++;
                }else if(sexo == 1 && idade > 40){
                    contHMob++;
                }else {
                    contMFull++;
                }

                System.out.println();
                System.out.println("Deseja cadastrar um novo colaborador? ");
                novo = sc.next().charAt(0);

            } while (novo != 'n');

            System.out.println("Total de pessoas desenvolvedoras Backend: " + contBack);
            System.out.println("Total de mulheres desenvolvedoras Frontend: " + contMFront);
            System.out.println("Total de homens desenvolvedores Mobile maiores de 40 anos: " + contHMob);
            System.out.println("Total de mulheres desenvolvedoras FullStack menores de 30 anos: " + contMFull);
        }
    }

    //
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

    //
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
}
*/