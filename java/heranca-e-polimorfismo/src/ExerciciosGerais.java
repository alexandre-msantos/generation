/*import Exercicio01.Cliente;

public class ExerciciosGerais {
    package Exercicio01;

    public abstract class Cliente {

        private long id;
        private String nome;

        public Cliente() {
        }

        public Cliente(long id, String nome) {
            this.id = id;
            this.nome = nome;
        }

        public long getId() {
            return id;
        }

        public String getNome() {
            return nome;
        }

        public void setNome(String nome) {
            this.nome = nome;
        }

        public void visualizar() {
            System.out.println("Cliente: ");
            System.out.println("Id: " + id);
            System.out.println("Nome: " + nome);
        }
    }

    package Exercicio01;

    public class PessoaFisica extends Exercicio01.Cliente {

        private String cpf;

        public PessoaFisica(long id, String nome, String cpf) {
            super(id, nome);
            this.cpf = cpf;
        }

        public String getCpf() {
            return cpf;
        }

        public void setCpf(String cpf) {
            this.cpf = cpf;
        }

        @Override
        public void visualizar() {
            System.out.println();
            super.visualizar();
            System.out.print("CPF: " + cpf);
            System.out.println();
        }
    }

    package Exercicio01;

    public class PessoaJuridica extends Exercicio01.Cliente {

        private String cnpj;

        public PessoaJuridica(long id, String nome, String cnpj) {
            super(id, nome);
            this.cnpj = cnpj;
        }

        public String getCnpj() {
            return cnpj;
        }

        public void setCnpj(String cnpj) {
            this.cnpj = cnpj;
        }

        @Override
        public void visualizar() {
            System.out.println();
            super.visualizar();
            System.out.println("CNPJ: " + cnpj);
        }
    }

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

    //------------------
}

*/
