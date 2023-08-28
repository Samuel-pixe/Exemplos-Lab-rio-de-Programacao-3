
package exemplo02;

import javax.swing.JOptionPane;

public class Exemplo02 {
     
    public static void main(String[] args)
    {
    
     String nome = "João da Silva";
     double altura = 1.95;
     double peso = 92.58;
     double IMC=peso / Math.pow(altura, 2);
             
     JOptionPane.showMessageDialog(null,String.format("O Imc do %s e %.2f", nome, IMC));
    
}
}
