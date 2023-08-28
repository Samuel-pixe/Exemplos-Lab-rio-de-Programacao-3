
package exemplo04;

//Especificação da classe carro
public class Carro {
    
    //Atributos
    public String marca;
    public String modelo;
    public int anoFabricacao;
    public int velocidadeAtual;
    
    
    //Metodos
    public void acelerar(){
        velocidadeAtual = velocidadeAtual +1;
    }
     public void frear(){
        velocidadeAtual = velocidadeAtual -1;
    }
    public void msg(){
        System.out.println("A velocidade atual do carro "+ modelo + " da marca " + marca + " é " + velocidadeAtual + " km/h");
    }
    
    //Metodo toString 
    //O método toString é utilizado para retornar 
    //todos os dados do objeto no formato String
    @Override
    public String toString(){
        return String.format("\nMarca: \t %s"+"\nModelo: \t %s"+"\nAno: \t %d"+"\nVelocidade: \t %d km/h", marca.toUpperCase(),modelo,anoFabricacao,velocidadeAtual);
    }
}
