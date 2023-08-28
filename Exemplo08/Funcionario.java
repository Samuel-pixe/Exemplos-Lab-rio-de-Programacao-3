
package Exemplo08;

/*
    Classe ABSTRATA: é uma classe que serve de referência
para outras classes. A classe abstrata sempre é utilizada
em uma situação de herança.

    A visibilidade protected permite que um atributo ou
método seja utilizado na classe que foi definido ou nas
classes derivadas.
 */
public abstract class Funcionario {
    
    protected String nome;
    protected double salario;

    public Funcionario() {
    }

    public Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
    }
    //Métodos abstratos os métodos deveram ser obrigatoriamente implementados nas classes derivadas
    public abstract String getNome();
    public abstract double getSalario();

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
   
    @Override
    public String toString() {
        return "Nome: " + getNome() + "\n" + 
               "Salario: R$" + getSalario() + "\n";
    }
    
}
