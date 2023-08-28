
package exemplo07;


public abstract class Forma{
    public abstract String getNome();
    public abstract double getArea();

    @Override
    public String toString() {
        return "Forma=" + getNome() + "\n" +
                "Área=" + String.format("%.2f\n",getArea());
    }
    
}
