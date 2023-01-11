import java.util.Scanner;

/*
    Escreva um algoritmo em Portugol, que leia a idade de uma pessoa (número inteiro) e apresente na tela
    se a pessoa está ou não apta a votar e se seu voto é obrigatório ou facultativo,
    */
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
