// classe filha, subclasse ou classe derivada
package exemplo07;


public class PessoaFisica extends Pessoa{
    
    private String cpf;
    private String rg;
    
    public PessoaFisica(){
        
    }
    //ALT+ Insert
    public PessoaFisica(String nome,String cpf, String rg) {
        super(nome);
        this.cpf = cpf;
        this.rg = rg;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    @Override
    public String toString() {
        return 
                super.toString() + //chamada do toString da Pessoa
                "CPF: "+ getCpf()+ "\n"+
                "RG: "+ getRg()+"\n";
    }
    
    
    
}
