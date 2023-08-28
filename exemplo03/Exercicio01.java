
/*package exemplo3;

import javax.swing.JOptionPane;

public class Exercicio01 {
    public static void main(String[] args) { 
            for (int i = 0; i <=2; i++) {
                
                int v1, v2, v3;
              v1 =  (int)(Math.random()*6;
              v2 =  (int)(Math.random()*6;
              v3 =  (int)(Math.random()*6;
              
JOptionPane.showMessageDialog(null,String.format("Primeiro numero %i\n segundo numero %i terceiro numero", v1, v2, v3));
        
        }
            
               
    }
}*/
package exemplo03;

import javax.swing.JOptionPane;

public class Exercicio01 {

    public static void main(String[] args) {
        
        String saida = "Números Sorteados: \n";
        int num, soma = 0;
        
        for (int i = 1; i <= 3; i++) {
            num = (int)((Math.random()*6)+1);
            soma += num;
            saida += num + "\n";
        }
        saida += "Total=" + soma;
        JOptionPane.showMessageDialog(null, saida);
    }
    
}
