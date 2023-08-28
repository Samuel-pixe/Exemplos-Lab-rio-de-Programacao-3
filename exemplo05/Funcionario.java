//
//package exemplo05;
//
//
//public class Funcionario {
//    private String nome;
//    private double salario;
//    private int ano;
//    
//    public void setNome(){
//        
//    }
//    
//    public void setBonificacao(int ano){
//    if(ano>5 && ano<10){
//        this.salario = (salario*0.05);    
//    }
//    if(ano>10 && ano<20){
//        this.salario = (salario*0.1);    
//    }
//    if(ano>20){
//        this.salario = (salario*0.2);    
//    }
//    
//    }
//    public int getAno(){
//        return this.ano;
//    }
//}
package exemplo05;

import java.time.LocalDate;

public class Funcionario {

    private String nome;
    private double salario;
    private int anocontratacao;

    public void setNome(String nome) {
        if (nome.length() >= 5) {
            this.nome = nome;
        } else {
            System.err.println("O nome é inválido.");
        }
    }

    public void setSalario(double salario) {
        if (salario >= 0) {
            this.salario = salario;
        } else {
            System.err.println("O salário é inválido.");
        }
    }

    public void setAnoContratacao(int anocontratacao) {
        if (anocontratacao >= 2000 && anocontratacao <= LocalDate.now().getYear()) {
            this.anocontratacao = anocontratacao;
        } else {
            System.err.println("O ano de contratação é inválido.");
        }
    }

    private double getBonificacao() {
        int tempo = LocalDate.now().getYear() - this.anocontratacao;
        if (tempo > 5 && tempo <= 10) {
            return 0.05;
        } else if (tempo > 10 && tempo <= 20) {
            return 0.10;
        } else if (tempo > 20) {
            return 0.20;
        } else {
            return 0.00;
        }
    }
    
    public double getSalarioTotal(){
        return this.salario + (this.salario*getBonificacao());
    }

    public String getNome(){
        return this.nome;
    }

    public double getSalario() {
        return salario;
    }

    public int getAnoContratacao() {
        return anocontratacao;
    }
    
    @Override
    public String toString(){
        return String.format(
            "\nNome...........: %s" +
            "\nSalário........: %.2f" +
            "\nAno contratação: %d" +
            "\nSalário Total..: %.2f",
            this.getNome(),this.getSalario(), this.getAnoContratacao(),
            this.getSalarioTotal()
        );
    }

}


