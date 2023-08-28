
package exemplo02;

import javax.swing.JOptionPane;

public class OperadoresAritimeticos {
    
    public static void main(String[] args)
    {
        String txt1, txt2, saida;
        double num1, num2;
        
        //Entrada de dados
        txt1 = JOptionPane.showInputDialog("Informe o primeiro valor: ");
        txt2 = JOptionPane.showInputDialog("Informe o segundo valor: ");
        
        //Conversão de String para double
        num1 = Double.parseDouble(txt1);
        num2 = Double.parseDouble(txt2);
        
        saida = String.format("Resultado = %.2f", (num1+num2));
      
        JOptionPane.showMessageDialog(null, saida);
    }
    
}
