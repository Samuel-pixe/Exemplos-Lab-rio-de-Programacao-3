
package Exemplo08;

import java.util.ArrayList;
import java.util.List;


public class FuncionarioTest {
    public static void main(String[] args) {
        
        List<Funcionario> Lista = new ArrayList<>();
        Lista.add(new Vendedor("João",2000,15000));
        Lista.add(new Vendedor("José",2000,18000));
        Lista.add(new Vendedor("Claudio",2000,12000));
        Lista.add(new Gerente("Ana",2000,95000));


        for(Funcionario f : Lista){
            System.out.println(f);
        }
        
    }
    
}
