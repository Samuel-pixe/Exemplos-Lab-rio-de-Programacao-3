
package Trabalho;


public class Usuario {
    
    protected int idU;
    protected String nome;
    protected String email;
    protected String senha;

    public Usuario() {
    }

    public Usuario(int idU, String nome, String email, String senha) {
        this.idU = idU;
        this.nome = nome;
        this.email = email;
        this.senha = senha;
    }

    public int getIdU() {
        return idU;
    }

    public void setIdU(int idU) {
        this.idU = idU;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    @Override
    public String toString() {
        return "Identificação Usuario: " + getIdU() +"\n" + 
                "Nome: " + getNome() + "\n" + 
                "Email: " + getEmail() + "\n";
    }
    
    
}
