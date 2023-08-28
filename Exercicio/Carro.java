
package Exercicio;


public class Carro extends Moto{

    protected String velocidade;
    protected String maleiro;

    public Carro() {
    }

    
    
    public Carro(String velocidade, String maleiro, String passageiros, String motor, String marca, String cor) {
        super(passageiros, motor, marca, cor);
        this.velocidade = velocidade;
        this.maleiro = maleiro;
    }

 

    public String getMaleiro() {
        return maleiro;
    }

    public void setMaleiro(String maleiro) {
        this.maleiro = maleiro;
    }
  
    public String getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(String velocidade) {
        this.velocidade = velocidade;
    }

   
    @Override
    public String toString() {
        return
                super.toString() + "Velocidade Maxima: " + getVelocidade()+ "\n" + "Maleiro: " + getMaleiro() + "\n";
    }
    
    
}
    

