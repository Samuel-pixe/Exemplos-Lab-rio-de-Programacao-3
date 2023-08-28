
package Trabalho;

public class Livro extends Usuario{
    
    protected int idL;
    protected String titulo;
    protected String autor;
    protected String edicao;
    protected String editora;
    protected String cidade;
    protected String anoPublicacao;

    public Livro() {
    }

    public Livro(int idL, String titulo, String autor, String edicao, String editora, String cidade, String anoPublicacao) {
        this.idL = idL;
        this.titulo = titulo;
        this.autor = autor;
        this.edicao = edicao;
        this.editora = editora;
        this.cidade = cidade;
        this.anoPublicacao = anoPublicacao;
    }

    public Livro(int idL, String titulo, String autor, String edicao, String editora, String cidade, String anoPublicacao, int idU, String nome, String email, String senha) {
        super(idU, nome, email, senha);
        this.idL = idL;
        this.titulo = titulo;
        this.autor = autor;
        this.edicao = edicao;
        this.editora = editora;
        this.cidade = cidade;
        this.anoPublicacao = anoPublicacao;
    }

    public int getIdL() {
        return idL;
    }

    public void setIdL(int idL) {
        this.idL = idL;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getEdicao() {
        return edicao;
    }

    public void setEdicao(String edicao) {
        this.edicao = edicao;
    }

    public String getEditora() {
        return editora;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getAnoPublicacao() {
        return anoPublicacao;
    }

    public void setAnoPublicacao(String anoPublicacao) {
        this.anoPublicacao = anoPublicacao;
    }

    @Override
    public String toString() {
        return "Identificação do Livro: " + getIdL() + "\n" +
               "Titulo: " + getTitulo() + "\n" +
               "Autor: " + getAutor() + "\n" +
               "Edicao: " + getEdicao() + "\n" +
               "Editora: " + getEditora() + "\n" +
               "Cidade: " + getCidade() + "\n" +
               "Ano Publicacao: " + getAnoPublicacao() + "\n";
    }
    
    
    
    
    
}
