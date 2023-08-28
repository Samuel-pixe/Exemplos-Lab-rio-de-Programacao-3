
package exemplo03;
        
import java.text.DecimalFormat;

public class exemplo2 {
    public static void main(String[] args) {
            //Classe para formatação de decimais
            DecimalFormat df = new DecimalFormat();
            
            df.applyPattern("00000");
            
            for (int i = 0; i <= 10; i++) {
                  
            System.out.println(df.format(i));
            }
            double valor = 2583.75;
            df.applyPattern("R$ #,##0.00");
            System.out.println(df.format(valor));
    }
}
