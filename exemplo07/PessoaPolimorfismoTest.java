package exemplo07;

import java.util.ArrayList;
import java.util.List;


public class PessoaPolimorfismoTest {
    public static void main(String[] args) {
            
        List<Pessoa> lista =new ArrayList();
        
        PessoaFisica pf = new PessoaFisica("ana","123","456");
        lista.add(pf);
        
        lista.add(new PessoaFisica("jose","666","456"));
        lista.add(new PessoaJuridica("Unaerp","12.456.789/0001-00"));
        lista.add(new Aluno(1,"eng","123.456.789-07","45687987","Tereza"));
        lista.add(new Aluno(2,"adm","789.456.123-00","852741797","Jorginho"));
        for(Pessoa p: lista){
            if( p instanceof Aluno){
                System.out.println(p);
            }
            
        }
        
    }
}
