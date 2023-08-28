package exemplo07;


public class Aluno extends PessoaFisica {
    
    private int codigo;
    private String curso;
    
    public Aluno(){
        
    }

    public Aluno(int codigo, String curso, String cpf, String rg, String nome) {
        super(nome, cpf, rg);
        this.codigo = codigo;
        this.curso = curso;
    }



    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    // polimorfismo por sobreposição 
    //sobrepor o metodo getNome da classe pessoa
    @Override
    public String getNome(){
        return super.nome + " (Graduação)";
    }
    
    @Override
    public String toString() {
        return 
                super.toString() + 
                "Codigo: "+ getCodigo()+ "\n"+
                "Curso: " + getCurso()+ "\n";
    }
    
    
}

