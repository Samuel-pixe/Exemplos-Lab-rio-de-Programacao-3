package exemplo03;

import javax.swing.JOptionPane;



public class Exercicio02 {

    public static void main(String[] args) {
        double valor, novo;
        String saida = "valor total:";
        do {

            valor = Double.parseDouble(JOptionPane.showInputDialog("Informe o valor do remedio: "));
            if (valor != 0) {
                novo = Math.round(valor * 1.12);
                JOptionPane.showMessageDialog(null, String.format("O novo valor do produto é R$ %.2f", novo));
            }
            }while (valor != 0);

  

    }
}
