package classes.itens;

public class Livro extends Item{
    private String autor;
    private int qtdePaginas;
    private int anoPublicacao;
    private int edicao;

    // GETTERS & SETTERS

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getQtdePaginas() {
        return qtdePaginas;
    }

    public void setQtdePaginas(int qtdePaginas) {
        this.qtdePaginas = qtdePaginas;
    }

    public int getAnoPublicacao() {
        return anoPublicacao;
    }

    public void setAnoPublicacao(int anoPublicacao) {
        this.anoPublicacao = anoPublicacao;
    }

    public int getEdicao() {
        return edicao;
    }

    public void setEdicao(int edicao) {
        this.edicao = edicao;
    }
}
