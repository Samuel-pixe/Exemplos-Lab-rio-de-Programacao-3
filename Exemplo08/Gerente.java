
package Exemplo08;

public class Gerente extends Funcionario{

    private double volumeVendas;

    public Gerente() {
    }


    public Gerente(String nome,double salario, double volumeVendas) {
        super(nome, salario);
        this.volumeVendas = volumeVendas;
    }
    
    
    
    @Override
    public String getNome() {
       return super.nome + "(Gerente)";
       }
    

    @Override
    public double getSalario() {
    return super.salario + (volumeVendas*0.02);
        }
    
}
