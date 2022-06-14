package br.com.view;

import br.com.view.model.gato;

public class PrimeiroProgama {
    public static void main(String[] args) {
        gato gato = new gato();
        System.out.println(gato);


        Livro livro1 = new Livro("o problema de java!", numPaginas 300);
        System.out.println(livro1);

      /*int a = 5;
       int b = 3;
        System.out.println("olá mundo " + (a+b));*/
    }
}

class Livro {
    private String nome;
    private Integer numPaginas;

    public Livro(String nome, Integer numPaginas) {
        this.nome = nome;
        this.numPaginas = numPaginas;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getNumPaginas() {
        return numPaginas;
    }

    public void setNumPaginas(Integer numPaginas) {
        this.numPaginas = numPaginas;
    }

    @Override
    public String toString() {
        return "Livro{" +
                "nome='" + nome + '\'' +
                ", numPaginas=" + numPaginas +
                '}';
    }
}