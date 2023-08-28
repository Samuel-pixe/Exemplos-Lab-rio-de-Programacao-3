package TrabalhoFinal;

public class imovel {
    enum Categorias{comercial,residencial}
    enum Tipos{Apartamento,Casa,Chacara,Sala,Salao,Sitio}
    public Categorias categoria;
    public Tipos tipo;
    private String nome;
    private String descricao;
    private Double valor;

    public imovel() {
    }

    public imovel(String nome,String descricao,Categorias categoria, Tipos tipo, double valor) {
        this.categoria = categoria;
        this.tipo = tipo;
        this.nome = nome;
        this.descricao = descricao;
        this.valor = valor;
    }

    public Categorias getCategoria() {
        return categoria;
    }

    public void setCategoria(Categorias categoria) {
        this.categoria = categoria;
    }

    public Tipos getTipo() {
        return tipo;
    }

    public void setTipo(Tipos tipo) {
        this.tipo = tipo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
 public String getValorString(){
 return this.valor.toString();
 }
 
}
