import java.util.Scanner;

/*  Escreva um algoritmo em Portugol, que leia 3 palavras (cadeia), que definem as características de um tipo de
    animal possível segundo o diagrama abaixo, que deve ser lido da esquerda para a direita.
*/
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
