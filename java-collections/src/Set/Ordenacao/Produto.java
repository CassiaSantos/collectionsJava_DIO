package Set.Ordenacao;

import java.util.Comparator;
import java.util.Objects;
import java.lang.Comparable;

public class Produto implements Comparable<Produto> {

    //atributos:
    private long codigo;
    private String nome;
    private double preco;
    private int quantidade;

    public Produto(long codigo, String nome, double preco, int quantidade) {
        this.codigo = codigo;
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    @Override
    public String toString() {
        return "Produto{" +
                "codigo=" + codigo +
                ", nome='" + nome + '\'' +
                ", preco=" + preco +
                ", quantidade=" + quantidade +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Produto produto = (Produto) o;
        return getCodigo() == produto.getCodigo();
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(getCodigo());
    }

    @Override
    public int compareTo(Produto produto) {
        return nome.compareToIgnoreCase(produto.getNome());
    }

    //Métodos acessores:
    public long getCodigo() {
        return codigo;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    static class ComparatorPorPreco implements Comparator<Produto>{
        @Override
        public int compare(Produto produto1, Produto produto2) {
            return Double.compare(produto1.getPreco(), produto2.getPreco());
        }
    }
}