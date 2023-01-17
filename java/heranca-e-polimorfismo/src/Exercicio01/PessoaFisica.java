package Exercicio01;

public class PessoaFisica extends Cliente{

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
