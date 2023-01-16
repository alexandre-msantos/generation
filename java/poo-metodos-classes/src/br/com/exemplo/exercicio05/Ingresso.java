package br.com.exemplo.exercicio05;

public class Ingresso {

    private long id;
    private String evento;
    private String tipo;
    private Integer lugar;
    private Double preco;

    public Ingresso() {
    }

    public Ingresso(long id, String evento, String tipo, Integer lugar, Double preco) {
        this.id = id;
        this.evento = evento;
        this.tipo = tipo;
        this.lugar = lugar;
        this.preco = preco;
    }

    public long getId() {
        return id;
    }

    public String getEvento() {
        return evento;
    }

    public void setEvento(String evento) {
        this.evento = evento;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Integer getLugar() {
        return lugar;
    }

    public void setLugar(Integer lugar) {
        this.lugar = lugar;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    @Override
    public String toString() {
        return "Ingresso: | "
                + id + " | evento: "
                + evento + " | tipo: "
                + tipo + " | lugar: "
                + lugar +  " | preco: "
                + preco;
    }
}
