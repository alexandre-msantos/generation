package br.com.exemplo.exercicio06;

public class Curso {

    private long id;
    private String nomeCurso;
    private String area;
    private String instrutor;
    private Double mensalidade;

    public Curso() {
    }

    public Curso(long id, String nomeCurso, String area, String instrutor, Double mensalidade) {
        this.id = id;
        this.nomeCurso = nomeCurso;
        this.area = area;
        this.instrutor = instrutor;
        this.mensalidade = mensalidade;
    }

    public long getId() {
        return id;
    }

    public String getNomeCurso() {
        return nomeCurso;
    }

    public void setNomeCurso(String nomeCurso) {
        this.nomeCurso = nomeCurso;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getInstrutor() {
        return instrutor;
    }

    public void setInstrutor(String instrutor) {
        this.instrutor = instrutor;
    }

    public Double getMensalidade() {
        return mensalidade;
    }

    public void setMensalidade(Double mensalidade) {
        this.mensalidade = mensalidade;
    }

    @Override
    public String toString() {
        return "Curso: | "
                + id + " | nomeCurso: "
                + nomeCurso + " | area: "
                + area + " instrutor: "
                + instrutor + " mensalidade: "
                + mensalidade;
    }
}
