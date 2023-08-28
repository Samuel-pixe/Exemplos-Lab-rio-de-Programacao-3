
package Trabalho;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;



     
public class Biblioteca extends Emprestimo{
    public static void main(String[] args) {
        
//    int pesquisal=0;
//    int pesquisau=0;
    
    List<Usuario> usuarios = new ArrayList<>();
    List<Livro> livro = new ArrayList<>();
    List<Emprestimo> emprestimo = new ArrayList<>();
    
    
    usuarios.add(new Usuario(111,"Joao","joao@gmail.com","abc"));
    usuarios.add(new Usuario(222,"Samuel","samuel@gmail.com","abc"));
       for(Usuario f : usuarios){
            System.out.println(f);
      }
       
    livro.add(new Livro(123,"Percy Jackson e o Ladrão de Raios","Rick Riordan","Chris Columbus","Intrínseca","San Antonio","2005"));
    livro.add(new Livro(123,"Percy Jackson e o Mar dos Monstros","Rick Riordan","Chris Columbus","Intrínseca","San Antonio","2009"));
        for(Livro l : livro){
            System.out.println(l);
      }
        
    emprestimo.add(new Emprestimo(111, 123, 321, true));
    emprestimo.add(new Emprestimo(222, 123, 321, false));

     for(Emprestimo e : emprestimo){
         System.out.println(e);
        }
//     for (Emprestimo e : emprestimo) {
//        if (l.getTitulo().equals(livro)) {
//         l.setDataDevolucao(LocalDate.now());
//          l.setDevolvido(true);
//                        }
//                    }
    }
}
//"17/05/2020", "18/05/2020", 
//"17/05/2020", "18/05/2020",