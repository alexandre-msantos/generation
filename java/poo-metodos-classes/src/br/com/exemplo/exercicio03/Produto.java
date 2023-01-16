package br.com.exemplo.exercicio03;

public class Produto {

    private long id;
    private String nomeProduto;
    private String tipo;
    private String fabricante;
    private Double preco;

    public Produto() {
    }

    public Produto(long id, String nomeProduto, String tipo, String fabricante, Double preco) {
        this.id = id;
        this.nomeProduto = nomeProduto;
        this.tipo = tipo;
        this.fabricante = fabricante;
        this.preco = preco;
    }

    public long getId() {
        return id;
    }

    public String getNomeProduto() {
        return nomeProduto;
    }

    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    @Override
    public String toString() {
        return "Produto: | id: "
                + id + " | nomeProduto: "
                + nomeProduto + " | tipo: "
                + tipo + " | fabricante: "
                + fabricante + " | preco: "
                + preco;
    }
}
