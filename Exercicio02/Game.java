
package Exercicio02;


public class Game extends Midia{
    
    protected int player;
    protected String plataforma;

    public Game() {
    }

    public Game(int player, String plataforma, String titulo, double time) {
        super(titulo, time);
        this.player = player;
        this.plataforma = plataforma;
    }

    public int getPlayer() {
        return player;
    }

    public void setPlayer(int player) {
        this.player = player;
    }

    public String getPlataforma() {
        return plataforma;
    }

    public void setPlataforma(String plataforma) {
        this.plataforma = plataforma;
    }

    @Override
    public String toString() {
        return 
               super.toString() + "Jogadores:" + getPlayer() + "\n" + "Plataforma:" + getPlataforma() + "\n";
    }
    
    
    
    
}
