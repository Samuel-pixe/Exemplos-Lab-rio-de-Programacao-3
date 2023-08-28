
package Exercicio02;


public class CD extends Midia{
    
    protected String artista;
    protected int nf;

    public CD() {
    }

    public CD(String artista, int nf, String titulo, double time) {
        super(titulo, time);
        this.artista = artista;
        this.nf = nf;
    }

    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    public int getNf() {
        return nf;
    }

    public void setNf(int nf) {
        this.nf = nf;
    }

    @Override
    public String toString() {
        return super.toString() + "Artista:" + getArtista() + "\n" + "Número de faixas:" + getNf() + "\n";
    }

    
    
    
    
}
