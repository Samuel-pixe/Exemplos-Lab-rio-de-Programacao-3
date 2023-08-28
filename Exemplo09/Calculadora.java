
package Exemplo09;


public class Calculadora implements ICalculadora {
    
    private int valor1;
    private int valor2;

    public Calculadora() {
    }

    public Calculadora(int valor1, int valor2) {
        this.valor1 = valor1;
        this.valor2 = valor2;
    }

    public int getValor1() {
        return valor1;
    }

    public void setValor1(int valor1) {
        this.valor1 = valor1;
    }

    public int getValor2() {
        return valor2;
    }

    public void setValor2(int valor2) {
        this.valor2 = valor2;
    }
    
    

    @Override
    public double getSoma() {
        return getValor1()+ getValor2();
    }

    @Override
    public double getSoma(int valor1, int valor2) {
        setValor1(valor1);
        setValor2(valor2);
        return getSoma();
    }

    @Override
    public double getSubtracao() {
         return getValor1() - getValor2();
        
    }

    @Override
    public double getSubtracao(int valor1, int valor2) {
        setValor1(valor1);
        setValor2(valor2);
        return getSubtracao();
    }

    @Override
    public String getResultado() {
        return String.format("Soma.: " + getSoma() + "\n" + "Subtração.: " + getSubtracao() + "\n" );
    }

    @Override
    public void exibirResultado() {
        System.out.println(getResultado());    
    }
    
}
