
package Exemplo06;

public class Funcionario {
    //Atributos
    private String nome;
    private int idade;
    
    //Construtor Padrão
    public Funcionario(){
        System.out.println("Contrutor Padrão");
        this.nome = "";
        this.idade = 8;
    }
    
    //Construtor Sobrecarregado
    public Funcionario(String nome){
        System.out.println("Construtor Sobrecarregado");
        this.nome = nome;
        
    }
       public Funcionario(String nome, int idade){
        System.out.println("Construtor Sobrecarregado");
        this.nome = nome;
        this.idade = idade;
    }
    
    
    //public
    public void setNome(String nome){
        this.nome = nome;
    }

    public void setIdade(int idade){
        this.idade = idade;
    }
    public String getNome(){
        return this.nome;
    }
    public int getIdade(){
        return this.idade;
    }
    @Override
    public String toString(){
        return String.format("Nome= %s\nIdade= %d", getNome(), getIdade());
    }
}