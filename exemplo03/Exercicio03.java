package exemplo03;

import javax.swing.JOptionPane;

public class Exercicio03 {

    public static void main(String[] args) {
        double vl1, vl2;
        String saida = "valor:";
        
        vl1 = Double.parseDouble(JOptionPane.showInputDialog("Informe o valor: "));  
        if(vl1!=0){
            
      // df.apllyPattern("Valor da raiz: ##.00");
       vl2=Math.sqrt(vl1);
        JOptionPane.showMessageDialog(null, String.format("O valor é %.2f", vl2));
        }
        else{
            JOptionPane.showMessageDialog(null,"Valor invalido");
        }
                }
}
    

/*}
package exemplo03;

import javax.swing.JOptionPane;

public class Exercicio02 {

    public static void main(String[] args) {

        double valor, novo;

        do {
            valor = Double.parseDouble(JOptionPane.showInputDialog(
                    "Informe o valor do produto: "));
            if (valor != 0) {
                novo = Math.round(valor * 1.12);
                JOptionPane.showMessageDialog(null, String.format(
                    "O novo valor do produto é R$ %.2f", novo));
            }
        } while (valor != 0);

    }

*/