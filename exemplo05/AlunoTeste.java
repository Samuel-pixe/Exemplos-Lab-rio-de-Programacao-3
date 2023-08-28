
package exemplo05;

public class AlunoTeste {
    public static void main(String[] args) {
        
        Aluno joao = new Aluno();
       // joao.codigo = 123456;
        joao.setCodigo(123456);
        
       //joao.nome = "João da Silva";
        joao.setNome("João da Silva");
        
       //joao.notaparcial = 8.5;
        joao.setNotaParcial(8.5);
        
       //joao.notafinal = 6.3;
        joao.setNotaFinal(6.3);
        
                System.out.println(joao);
                //System.out.println("Código: "+ joao.getCodigo());
                //System.out.println("Código: "+ joao.getNome());
    }
}
