
package Exercicio02;

public class MidiaTest {
    public static void main(String[] args) {
        
        Game cod = new Game();
        cod.setTitulo("Call of Duty");
        cod.setTime(0);
        cod.setPlayer(4);
        cod.setPlataforma("PC");
        System.out.println(cod);
        
        Video frozen = new Video();
        frozen.setTitulo("Frozen");
        frozen.setTime(104);
        frozen.setDiretor("Jennifer Lee e Chris Buck");        
        System.out.println(frozen);
        
        CD origins = new CD();
        origins.setTitulo("Origins - Imagine Dragons");
        origins.setTime(40.00);
        origins.setArtista("Banda Imagine Dragons");
        origins.setNf(15);
        System.out.println(origins);
        
            
    }
    
}
