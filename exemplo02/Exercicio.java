
package exemplo02;

 import javax.swing.JOptionPane;
        
public class Exercicio {
    
    public static void main(String[] args)
    {
        String txt1, txt2;
        double num1, num2;
                
        txt1 = JOptionPane.showInputDialog("Informe o primeiro valor: ");
        txt2 = JOptionPane.showInputDialog("Informe o segundo valor: ");
        
        num1 = Double.parseDouble(txt1);
        num2 = Double.parseDouble(txt2);
        
        double soma = num1+num2;
        double div = num1/num2;
        double sub = num1-num2;
        double mult = num1*num2;
        
        JOptionPane.showMessageDialog(null,String.format("Soma: %.2f\n Subtração: %.2f\n Multiplicação: %.2f\n Divisão: %.2f\n", soma, sub,  mult, div));
    }
    
}
