/*package br.com.exemplo;

import br.com.exemplo.exercicio01.Cliente;

import java.util.Scanner;

public class ExerciciosGerais {

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

    package br.com.exemplo.exercicio01;

import java.util.Scanner;

    public class TestaCliente {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            br.com.exemplo.exercicio01.Cliente cliente1 = new br.com.exemplo.exercicio01.Cliente(01, "Anna Silva", "012.345.678-00", 18, "65 99851-0000");
            br.com.exemplo.exercicio01.Cliente cliente2 = new br.com.exemplo.exercicio01.Cliente(02, "João Macedo", "123.456.789-02", 35, "97 99991-1234");

            System.out.println(cliente1);
            System.out.println(cliente2);
        }
    }


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
package br.com.exemplo.exercicio02;

public class TestaFuncionario {
    public static void main(String[] args) {

    Funcionario func1 = new Funcionario(01, "Diego Veríssimo", "001.002.003-00", "Gerente financeiro", 10000.00);
    Funcionario func2 = new Funcionario(02, "Aldo Nunes", "005.006.007-02", "Analista financeiro", 5000.00);

        System.out.println(func1);
        System.out.println(func2);

    }
}

//
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

package br.com.exemplo.exercicio03;

public class TestaProduto {
    public static void main(String[] args) {

        Produto prod1 = new Produto(01, "PlayStation 5", "Console", "Sony", 4500.00);
        Produto prod2 = new Produto(02, "Fifa 23", "Jogo", "EA Games", 300.00);

        System.out.println(prod1);
        System.out.println(prod2);
    }
}


//
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

package br.com.exemplo.exercicio04;

public class TestaFarmacia {
    public static void main(String[] args) {

        Farmacia prod1 = new Farmacia(01, "Xarope", "Xaropil", "Medicamento", 12.00);
        Farmacia prod2 = new Farmacia(02, "Shampoo", "Dove", "Produto de higiene", 18.00);

        System.out.println(prod1);
        System.out.println(prod2);
    }
}

//
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

package br.com.exemplo.exercicio05;

public class TestaIngresso {
    public static void main(String[] args) {

        Ingresso ing1 = new Ingresso(01, "Filme - Avatar", "Inteira", 15, 20.00);
        Ingresso ing2 = new Ingresso(02, "Filme - Senhor dos Anéis", "Meia-Entrada", 25, 10.00);

        System.out.println(ing1);
        System.out.println(ing2);
    }
}

//
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

package br.com.exemplo.exercicio06;

public class TestaCurso {
    public static void main(String[] args) {

        Curso curso1 = new Curso(01, "lingua Inglesa", "Idiomas", "Paulo Machado", 200.00);
        Curso curso2 = new Curso(02, "Java Básico", "Programação", "Bruna Peixoto", 300.00);

        System.out.println(curso1);
        System.out.println(curso2);
    }
}
}
*/
