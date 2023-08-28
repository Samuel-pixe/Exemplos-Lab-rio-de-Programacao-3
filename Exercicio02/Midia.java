
package Exercicio02;


public class Midia {
    protected String titulo;
    protected double time;

    public Midia() {
    }

    public Midia(String titulo, double time) {
        this.titulo = titulo;
        this.time = time;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public double getTime() {
        return time;
    }

    public void setTime(double time) {
        this.time = (time*60);

    }
    @Override
    public String toString() {
        return "Midia: " + getTitulo() + "\n" + "Duração: " + getTime() +"s" + "\n";
    }  
    
}
