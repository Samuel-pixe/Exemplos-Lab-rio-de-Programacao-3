
package Exemplo09;

import javax.swing.JOptionPane;


public class CalculadoraTest {
    public static void main(String[] args) {
        Calculadora calc = new Calculadora();
        calc.setValor1(10);
        calc.setValor2(8);
        
        System.out.println(ICalculadora.NOME_APP);
        calc.exibirResultado();
       
        
       JOptionPane.showMessageDialog(null, 
            calc.getResultado(),
            ICalculadora.NOME_APP,
            JOptionPane.INFORMATION_MESSAGE);
    }
}
