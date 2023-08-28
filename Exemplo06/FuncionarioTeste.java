
package Exemplo06;

import javax.swing.JOptionPane;

public class FuncionarioTeste {
    public static void main(String[] args) {
        
        Funcionario f1 = new Funcionario();
        f1.setNome("Nome da Silva");
        f1.setIdade(99);
        System.out.println(f1);
        
        Funcionario f2 = new Funcionario();
        System.out.println(f2);
        
       
        
        String nome = JOptionPane.showInputDialog("Informe o Nome: ");
        Funcionario f3 = new Funcionario(nome);
        System.out.println(f3);
        
         Funcionario f4 = new Funcionario("nome", 2);
        System.out.println(f4);
        
    }
    
}
