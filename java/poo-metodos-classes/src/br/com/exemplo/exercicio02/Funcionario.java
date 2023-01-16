package br.com.exemplo.exercicio02;

public class Funcionario {

    private long id;
    private String nome;
    private String cpf;
    private String cargo;
    private Double salario;

    public Funcionario() {
    }

    public Funcionario(long id, String nome, String cpf, String cargo, Double salario) {
        this.id = id;
        this.nome = nome;
        this.cpf = cpf;
        this.cargo = cargo;
        this.salario = salario;
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

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "Funcionario |id: "
                + id + "| nome: "
                + nome + "| cpf: "
                + cpf + "| cargo: "
                + cargo + " salario: "
                + salario;
    }
}
