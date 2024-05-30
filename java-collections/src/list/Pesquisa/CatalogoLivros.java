package list.Pesquisa;
import java.util.ArrayList;
import java.util.List;

public class CatalogoLivros {
    private List<Livro> livroList;

    public CatalogoLivros() {
        this.livroList = new ArrayList<>();
    }
    //método para adicionar livros:
    public void adicionarLivro(String titulo, String autor, int anoPublicacao){
        livroList.add(new Livro(titulo, autor, anoPublicacao));
    }

    //método para pesquisar por autor:
    public List<Livro> pesquisarPorAutor(String autor) {
        List<Livro> livroPorAutor = new ArrayList<>();
        if (!livroList.isEmpty()){
            for (Livro livro : livroList){
                if (livro.getAutorLivro().equalsIgnoreCase(autor)){
                    livroPorAutor.add(livro);
                }
            }
        }
        return livroPorAutor;
    }

    //pesquisa por intervalo de anos:
    public List<Livro> pesquisarPorIntervaloAno(int anoInicial, int anoFinal){
        List<Livro> livroPorIntervaloAno = new ArrayList<>();
        if (!livroList.isEmpty()){
            for (Livro livro : livroList){
                if (livro.getAnoPublicacaoLivro() >= anoInicial && livro.getAnoPublicacaoLivro() <= anoFinal){
                    livroPorIntervaloAno.add(livro);
                }
            }
        }
        return livroPorIntervaloAno;
    }

    //pesquisa por autor:
    public Livro pesquisarPorTitulo(String titulo){
        Livro livroPorTitulo = null;//ainda não há nehum objeto livro com este título
        if (livroList.isEmpty()){
            for (Livro livro : livroList){
                if (livro.getTituloLivro().equalsIgnoreCase(titulo)){
                    livroPorTitulo = livro;
                    break;
                }
            }
        }
    return livroPorTitulo;
    }


    //método main():
    public static void main(String[] args) {
        //Criando uma instância do catálogo de livros
        CatalogoLivros catalogoLivros = new CatalogoLivros();

        //Adicionando livros ao catálogo
        catalogoLivros.adicionarLivro("Microsserviços Prontos Para a Produção", "Susan J. Fowler", 2017);
        catalogoLivros.adicionarLivro("Java Guia do Programador", "Peter Jandl Junior", 2021);
        catalogoLivros.adicionarLivro("Código Limpo", "Robert C. Martin", 2009);
        catalogoLivros.adicionarLivro("O Codificador Limpo", "Robert C. Martin", 2012);

        //Exibindo livros pelo mesmo autor
        System.out.println(catalogoLivros.pesquisarPorAutor("Robert C. Martin"));

        //Exibindo livros pelo mesmo autor (caso em que não há livros de um autor específico)
        System.out.println(catalogoLivros.pesquisarPorAutor("Autor Inexistente"));

        //Exibindo livros dentro de um intervalo de anos
        System.out.println(catalogoLivros.pesquisarPorIntervaloAno(2010, 2022));

        //Exibindo livros dentro de um intervalo de anos (caso em que não há livros no intervalo)
        System.out.println(catalogoLivros.pesquisarPorIntervaloAno(2025, 2030));

        //Exibindo livros por título
        System.out.println(catalogoLivros.pesquisarPorTitulo("Java Guia do Programador"));

        //Exibindo livros por título (caso em que não há livros com o título especificado)
        System.out.println(catalogoLivros.pesquisarPorTitulo("Título Inexistente"));
    }
}