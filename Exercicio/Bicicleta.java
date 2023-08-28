package Exercicio;


public class Bicicleta {
    
     protected String marca;
     protected String cor;

    public Bicicleta() {
    }

     
    public Bicicleta(String marca, String cor) {
        this.marca = marca;
        this.cor = cor;
    }

     
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    @Override
    public String toString() {
        return "Marca: " + marca + "\nCor: " + cor + "\n";
    }
         
}
