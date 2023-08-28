// classe PAI ou superclasse
package exemplo07;

public class Pessoa {
    
    protected String nome;
    
    public Pessoa(){
        
    }
    
    public Pessoa(String nome){
        this.nome = nome;
    }

    public String getNome() {
        return nome.toUpperCase();
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Nome: " + getNome() + "\n";
    }
      
    
}

