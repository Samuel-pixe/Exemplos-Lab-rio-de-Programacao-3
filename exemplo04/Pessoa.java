
package exemplo04;

public class Pessoa {
    
    public String nome;
    public double altura;
    public double peso;
    


public double imc(){
    
    return (peso/Math.pow(altura,2));
}

@Override
public String toString(){
    return String.format("\nNome: %s"+"\nPeso: &.2f"+"\nAltura: %.2f"+"\nIMC: %.2f", nome, peso, altura, imc());
}
}