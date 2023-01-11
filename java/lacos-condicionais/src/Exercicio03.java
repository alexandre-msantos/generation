import java.util.Locale;
import java.util.Scanner;

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
