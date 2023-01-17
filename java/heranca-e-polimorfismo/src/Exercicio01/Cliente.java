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
