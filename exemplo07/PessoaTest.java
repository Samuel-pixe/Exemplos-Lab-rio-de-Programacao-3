package exemplo07;


public class PessoaTest {
    //psvm tab tab
    public static void main(String[] args) {
        
           PessoaFisica joao = new PessoaFisica();
           joao.setNome("Joao da Silva");
           joao.setCpf("123.456.789-12");
           joao.setRg("45.456.546-01");
           System.out.println(joao);
           
           
           PessoaJuridica unaerp = new PessoaJuridica();
           unaerp.setNome("Universidade de ribeirao preto");
           unaerp.setCnpj("45.123.456/0001-45");
           System.out.println(unaerp);
           
           
           Aluno jose = new Aluno();
           jose.setNome("Jose Antonio");
           jose.setCodigo(12354);
           jose.setCurso("Engemharia da Computação");
           jose.setCpf("147.258.369-87");
           jose.setRg("12.123.156-0");
           System.out.println(jose);
          
           
           Aluno ana = new Aluno(1235456,"Engenharia da Computação","147.258.369-87",
           "12.123.156-0","Ana Carena");
           System.out.println(ana);
    }
}

