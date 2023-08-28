
package Trabalho;

import java.time.LocalDate;


public class Emprestimo extends Livro{
    
    
    protected int idEmprestimo;
    protected int idUsuario;
    protected int idLivro;
   // protected String dataemprestimo;
   // protected String datadevolucao;
    protected boolean devolvido = true;
    LocalDate DataEmprestimo = LocalDate.now();
    LocalDate DataDevolucao = LocalDate.now();
    

    public Emprestimo() {
    }

//    public Emprestimo(int idEmprestimo, int idUsuario, int idLivro, String dataemprestimo, String datadevolucao, boolean devolvido) {
//        this.idEmprestimo = idEmprestimo;
//        this.idUsuario = idUsuario;
//        this.idLivro = idLivro;
//        this.dataemprestimo = dataemprestimo;
//        this.datadevolucao = datadevolucao;
//        this.devolvido=devolvido;
//    }

    public Emprestimo(int idEmprestimo, int idUsuario, int idLivro, boolean devolvido) {
        this.idEmprestimo = idEmprestimo;
        this.idUsuario = idUsuario;
        this.idLivro = idLivro;
        this.devolvido=devolvido;
    }

    public LocalDate getDataEmprestimo() {
        return DataEmprestimo;
    }

    public void setDataEmprestimo(LocalDate DataEmprestimo) {
        this.DataEmprestimo = DataEmprestimo;
    }

    public LocalDate getDataDevolucao() {
        return DataDevolucao;
    }

    public void setDataDevolucao(LocalDate DataDevolucao) {
        this.DataDevolucao = DataDevolucao;
    }

 
    
    

//    public String getDataemprestimo() {
//        return dataemprestimo;
//    }
//
//    public void setDataemprestimo(String dataemprestimo) {
//        this.dataemprestimo = dataemprestimo;
//    }
//
//    public String getDatadevolucao() {
//        return datadevolucao;
//    }
//
//    public void setDatadevolucao(String datadevolucao) {
//        this.datadevolucao = datadevolucao;
//    }
//   
    
    public boolean isDevolvido() {
        return devolvido;
    }

    public void setDevolvido(boolean devolvido) {
        this.devolvido = devolvido;
    }
    

    public int getIdEmprestimo() {
        return idEmprestimo;
    }

    public void setIdEmprestimo(int idEmprestimo) {
        this.idEmprestimo = idEmprestimo;
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public int getIdLivro() {
        return idLivro;
    }

    public void setIdLivro(int idLivro) {
        this.idLivro = idLivro;
    }

    @Override
    public String toString() {
        return "Idenficação de Emprestimo: " + getIdEmprestimo() + "\n" +
               "Identficação de Usuario: " + getIdUsuario() + "\n" +
               "Identificação de Livro: " + getIdLivro() + "\n" +
               "Data do Empretimo: " + getDataEmprestimo() + "\n" +
               "Data devolução: " + getDataDevolucao() + "\n" + 
               "Devolvido: " + (devolvido ? "SIM" : "NÃO")+ "\n";
    }  
    
}
//LocalDate localDateAntigo = LocalDate.of(2010, 3, 7);
//     LocalDate localDateNovo = LocalDate.of(2015, 3, 5);
// 
//     System.out.println(localDateAntigo.isAfter(localDateNovo));
//     System.out.println(localDateAntigo.isBefore(localDateNovo));
//     System.out.println(localDateAntigo.isEqual(localDateNovo));