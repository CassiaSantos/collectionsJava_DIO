package list.Pesquisa;

public class Livro {

    //atributos:
    private String tituloLivro;
    private String autorLivro;
    private int anoPublicacaoLivro;

    //método construtor:
    public Livro(String tituloLivro, String autorLivro, int anoPublicacaoLivro) {
        this.tituloLivro = tituloLivro;
        this.autorLivro = autorLivro;
        this.anoPublicacaoLivro = anoPublicacaoLivro;
    }

    public String getTituloLivro() {
        return this.tituloLivro;
    }

    public String getAutorLivro() {
        return this.autorLivro;
    }

    public int getAnoPublicacaoLivro() {
        return this.anoPublicacaoLivro;
    }

    @Override
    public String toString() {
        return "Livro{" +
                "tituloLivro='" + tituloLivro + '\'' +
                ", autorLivro='" + autorLivro + '\'' +
                ", anoPublicacaoLivro=" + anoPublicacaoLivro +
                '}';
    }
}
