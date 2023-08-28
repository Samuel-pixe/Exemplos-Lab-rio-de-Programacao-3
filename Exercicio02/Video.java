
package Exercicio02;


public class Video extends Midia{
    
    protected String diretor;

    public Video() {
    }

    public Video(String diretor, String titulo, double time) {
        super(titulo, time);
        this.diretor = diretor;
    }

    public String getDiretor() {
        return diretor;
    }

    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }

    @Override
    public String toString() {
        return 
                super.toString() + "Diretor:" + getDiretor() + "\n";
    }
    
    
    
    
}
