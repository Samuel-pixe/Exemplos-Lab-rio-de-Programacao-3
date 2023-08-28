/*
Todos os métodos da interface serão abstratos 
 */
package Exemplo09;


public interface ICalculadora {
    
    public final String NOME_APP = "Calculadora";
    
    public abstract double getSoma();
    public abstract double getSoma(int valor1, int valor2);
    
    public abstract double getSubtracao();
    public abstract double getSubtracao(int valor1, int valor2);
    
    public abstract String getResultado();
    public abstract void exibirResultado();
    
}
