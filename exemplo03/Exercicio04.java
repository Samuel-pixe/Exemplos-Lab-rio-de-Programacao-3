package exemplo03;

import javax.swing.JOptionPane;

public class Exercicio04 {

    public static void main(String[] args) {
        int vet[] = new int[5];
        double vl1;
        for (int i = 0; i < vet.length; i++) {
            int j = vet[i];
            vl1 = Double.parseDouble(JOptionPane.showInputDialog("Informe a nota: "));
            vet[i] = (int) vl1;

        }
        for (int i = 0; i < vet.length; i++) {
            System.out.print(vet[i] + "\t");
            int j = vet[i];

        }
    }

}
/*package exemplo03;

import java.util.Arrays;
import java.util.Collections;
import javax.swing.JOptionPane;

public class Exercicio04 {
    
    public static void main(String[] args) {
        
        double vet[] = new double[5];
        double soma = 0;
        for (int i = 0; i < vet.length; i++) {
            vet[i] = Double.parseDouble(
                JOptionPane.showInputDialog("Nota " + (i+1) + ":"));
            soma += vet[i];
        }
        
        Arrays.sort(vet);
        
        int fim = vet.length-1;
        for (int i = 0; i <= vet.length/2; i++) {
            double temp = vet[i];
            vet[i] = vet[fim-i];
            vet[fim-i] = temp;
        }

        JOptionPane.showMessageDialog(null,
            String.format(
                "Notas: %s\nMédia: %.2f",
                Arrays.toString(vet), 
                (soma/vet.length)
            )
        );
    }
    
}*/