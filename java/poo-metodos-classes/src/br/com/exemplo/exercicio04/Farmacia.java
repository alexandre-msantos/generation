package br.com.exemplo.exercicio04;

public class Farmacia {

    private long id;
    private String produto;
    private String marca;
    private String tipo;
    private Double preco;

    public Farmacia() {
    }

    public Farmacia(long id, String produto, String marca, String tipo, Double preco) {
        this.id = id;
        this.produto = produto;
        this.marca = marca;
        this.tipo = tipo;
        this.preco = preco;
    }

    public long getId() {
        return id;
    }

    public String getProduto() {
        return produto;
    }

    public void setProduto(String produto) {
        this.produto = produto;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    @Override
    public String toString() {
        return "Farmacia: | "
                + id + " | produto: "
                + produto + " | marca: "
                + marca + " | tipo: "
                + tipo + " | preco: "
                + preco;
    }
}
