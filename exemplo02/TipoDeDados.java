
package exemplo02;

import javax.swing.JOptionPane;

public class TipoDeDados {

    //BLOCO PRINCIPAL da classe
    public static void main(String[] args){
        
        int x = 10;
        int y = 20;
        
        System.out.println("Soma = " + (x+y));
        
        JOptionPane.showMessageDialog(
            null,
            "Soma = " + (x+y)
        );
    }
}