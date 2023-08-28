/*
package exemplo02;

import javax.swing.JOptionPane;

public class Exercicio03 {
   public static void main(String[] args)
   {
       String txt1, txt2;
       double num1;
       
       txt1 = JOptionPane.showInputDialog("Imforme o nome do produto");
       txt2 = JOptionPane.showInputDialog("Informe o valor do produto: ");
       
       num1 = Double.parseDouble(txt2);
       
      if(num1 >=0){ 
       if(num1>=50 && <200){ 
       num1 = ((num1*5)/100);
   }
       if(num1>=200 && <500){
       num1 = ((num1*6)/100);
   }
       if(num1>=500 && <1000){
       num1 = ((num1*7)/100);
   }
       if(num1>1000){
       num1 = ((num1*5)/100);
    }

   }
}
   package exemplo02;

import javax.swing.JOptionPane;

public class Exercicio4 {

    public static void main(String[] args) 

        String nome;
        double valor, original;

        nome = JOptionPane.showInputDialog("Produto");
        valor = Double.parseDouble(JOptionPane.showInputDialog("Valor (R$)"));

        if (valor >= 0) {
            original = valor;
            if (valor >= 50 && valor < 200) {
                valor -= (valor * 0.05);
            } else if (valor >= 200 && valor < 500) {
                valor -= (valor * 0.06);
            } else if (valor >= 500 && valor < 1000) {
                valor -= (valor * 0.07);
            } else if (valor >= 1000) {
                valor -= (valor * 0.08);
            }
            
            JOptionPane.showMessageDialog(null,
                String.format("Produto: %s\nValor original: R$ %.2f\nNovo valor: R$ %.2f",
                    nome,original,valor)
            );
            
        }else{
            JOptionPane.showMessageDialog(null, 
                "O valor do produto deve ser maior ou igual a zero", 
                "Valor do Produto",JOptionPane.ERROR_MESSAGE);
        }

    }

}*/