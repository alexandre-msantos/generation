package Exercicio01;

public class PessoaJuridica extends Cliente{

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
