import java.util.Scanner;

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
