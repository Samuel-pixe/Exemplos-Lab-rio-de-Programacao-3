
package Exemplo08;


public class Vendedor extends Funcionario{
    
    private double totalVendas;
    
    public Vendedor(){
    }
    
    public Vendedor(String nome, double salario, double totalVendas) {
        super(nome, salario);
        this.totalVendas = totalVendas;
    }
    
    @Override 
    public String getNome(){
        return super.nome + "(Vendedor)";
    }
    


    @Override
    public double getSalario() {
         return super.salario + (this.totalVendas*0.08); 
    }
    
    
}
