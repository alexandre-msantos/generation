package br.com.exemplo.exercicio01;

public class Cliente {

    private Integer id;
    private String nome;
    private String cpf;
    private Integer idade;
    private String telefone;

    public Cliente() {
    }

    public Cliente(Integer id, String nome, String cpf, Integer idade, String telefone) {
        this.id = id;
        this.nome = nome;
        this.cpf = cpf;
        this.idade = idade;
        this.telefone = telefone;
    }

    public Integer getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    @Override
    public String toString() {
        return "Cliente |id: "
                + id +  " | nome: "
                + nome + " | cpf: "
                + cpf + " | idade: "
                + idade +   "| telefone: "
                + telefone;
    }
}
