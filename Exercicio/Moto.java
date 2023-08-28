
package Exercicio;


public class Moto extends Bicicleta {
    
    protected String passageiros;
    protected String motor;

    public Moto() {
    }


    
    public Moto(String passageiros, String motor, String marca, String cor) {
        super(marca, cor);
        this.passageiros = passageiros;
        this.motor = motor;
    }

    

    public String getMotor() {
        return motor;
    }

    public void setMotor(String motor) {
        this.motor = motor;
    }
    
    
    public String getPassageiros() {
        return passageiros;
    }

    public void setPassageiros(String passageiros) {
        this.passageiros = passageiros;
    }

    @Override
    public String toString() {
        return 
                super.toString() + "Passageiros: " + getPassageiros()+ "\n" + "Motor: " + getMotor() + "\n";
    }
    
    

}
