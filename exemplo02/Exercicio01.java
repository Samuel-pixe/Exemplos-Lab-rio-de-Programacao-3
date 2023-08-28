
package exemplo02;

import javax.swing.JOptionPane;

public class Exercicio01 {
    
    public static void main(String[] args)
    {
        String txt1, txt2, saida;
        double num1, num2;
        
        txt1 = JOptionPane.showInputDialog("Informe a nota parcial: ");
        txt2 = JOptionPane.showInputDialog("Informe a nota final: ");
        
        num1 = Double.parseDouble(txt1);
        num2 = Double.parseDouble(txt2);
        
        saida = String.format("Media = %.2f", (num1*0.4+num2*0.6));
        
        System.out.println("Media = " + (num1*0.4+num2*0.6));
        JOptionPane.showMessageDialog(null, saida);

    }
}