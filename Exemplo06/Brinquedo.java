

package Exemplo06;


public class Brinquedo{
    
private String nome;
private String faixaetaria;
private double preco;

    
public Brinquedo(){
        this.nome = "";
        this.faixaetaria = "";
        this.preco = 0.0;
    }


public Brinquedo(String nome){
        this.nome = "";
        this.faixaetaria = "";
        this.preco = 0.0;
    }

public Brinquedo(String nome,String faixaetaria){
        this.nome = "";
        //this.faixaEtaria = faixaEtaria;
        setFaixaEtaria(faixaetaria);
        this.preco = 0.0;
    }
public Brinquedo(String nome, String faixaetaria, double preco){
        this.nome = "";
        //this.faixaEtaria = faixaEtaria;
        setFaixaEtaria(faixaetaria);
        this.preco = 0.0;
    }


public void setNome(String nome){
        this.nome = nome;
    }
   
public String getNome(){
        return this.nome;
    }
  
public void setFaixaEtaria(String faixaetaria){
    switch(faixaetaria){
        case"0 a 2":
        this.faixaetaria = faixaetaria;
        break;
        case"3 a 5":
        this.faixaetaria = faixaetaria;
        break;
        case"6 a 10":
        this.faixaetaria = faixaetaria;
        break;
        case"acima de 10":
        this.faixaetaria = faixaetaria;
        break;
        default: System.out.println("O valor é invalido");
        this.faixaetaria = "";
    }
}
public String getFaixaEtaria(){
        return this.faixaetaria;
    }
public void setPreco(double preco){
        this.preco = preco;
    }
   
public double getPreco(){
        return this.preco;
    }
  @Override
    public String toString() {
        return String.format(
            "\nNome: %s\nFaixa Etária: %s\nPreço: %.2f",
            getNome(), getFaixaEtaria(), getPreco());
    }
  
}

//package exemplo06;
//
//public class Brinquedo {
//
//    private String nome;
//    private String faixaEtaria;
//    private double preco;
//
//    public Brinquedo() {
//        this.nome = "";
//        this.faixaEtaria = "";
//        this.preco = 0.0;
//    }
//
//    public Brinquedo(String nome) {
//        this.nome = nome;
//        this.faixaEtaria = "";
//        this.preco = 0.0;
//    }
//
//    public Brinquedo(String nome, String faixaEtaria) {
//        this.nome = nome;
//        //this.faixaEtaria = faixaEtaria;
//        setFaixaEtaria(faixaEtaria);
//        this.preco = 0.0;
//    }
//
//    public Brinquedo(String nome, String faixaEtaria, double preco) {
//        this.nome = nome;
//        //this.faixaEtaria = faixaEtaria;
//        setFaixaEtaria(faixaEtaria);
//        this.preco = preco;
//    }
//
//    public void setNome(String nome) {
//        this.nome = nome;
//    }
//
//    public void setFaixaEtaria(String faixaEtaria) {
//        switch(faixaEtaria){
//            case "0 a 2":
//                this.faixaEtaria = faixaEtaria;
//                break;
//            case "3 a 5":
//                this.faixaEtaria = faixaEtaria;
//                break;
//            case "6 a 10":
//                this.faixaEtaria = faixaEtaria;
//                break;  
//            case "acima de 10":
//                this.faixaEtaria = faixaEtaria;
//                break;       
//            default:
//                System.out.println("O valor informado é inválido.");
//                this.faixaEtaria = "";
//        }
//    }
//
//    public void setPreco(double preco) {
//        this.preco = preco;
//    }
//
//    public String getNome() {
//        return this.nome;
//    }
//
//    public String getFaixaEtaria() {
//        return this.faixaEtaria;
//    }
//
//    public double getPreco() {
//        return this.preco;
//    }
//
//    @Override
//    public String toString() {
//        return String.format(
//            "\nNome: %s\nFaixa Etária: %s\nPreço: %.2f",
//            getNome(), getFaixaEtaria(), getPreco());
//    }
//    
//}
