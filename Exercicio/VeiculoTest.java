
package Exercicio;

public class VeiculoTest {
    
    public static void main(String[] args) {
        
            
        Carro fiesta = new Carro();
        fiesta.setMarca("Ford Fiesta");
        fiesta.setCor("Prata");
        fiesta.setPassageiros("4");
        fiesta.setMotor("128cv");
        fiesta.setMaleiro("Médio");
        fiesta.setVelocidade("190km/h");
        System.out.println(fiesta);
        
        Moto harley = new Moto();
        harley.setMarca("Harley");
        harley.setCor("Prata");
        harley.setPassageiros("2");
        harley.setMotor("180cv");
        System.out.println(harley);
        
        
    }
}

