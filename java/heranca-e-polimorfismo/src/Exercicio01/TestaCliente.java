package Exercicio01;

public class TestaCliente {
    public static void main(String[] args) {

        PessoaFisica pf1 = new PessoaFisica(01, "Maria Silva", "001.002.003-00");
        pf1.visualizar();

        PessoaFisica pf2 = new PessoaFisica(02, "Joana Sousa", "002.003.004-00");
        pf2.visualizar();

        PessoaJuridica pj = new PessoaJuridica(01, "Ferragista Plena", "12.345.678/0001-00");
        pj.visualizar();

        PessoaJuridica pj2 = new PessoaJuridica(02, "Supermercado Ali", "23.456.789/0002-00");
        pj2.visualizar();
    }
}
