
package Exemplo06;


public class Retangulo {
    
    private double comprimento;
    private double largura;
    
    
 
public Retangulo(){
    this(0, 0);
    
}
    
 public Retangulo(double comprimento){
    this(comprimento, 0);
}  


public Retangulo(double comprimento, double largura){
    this.setComprimento(comprimento);
    this.setLargura(largura);
}

public double getComprimento(){
       return this.comprimento;
   }

   public void setComprimento(double comprimento){
    if(testeIntervalo(comprimento)){
      this.comprimento = comprimento;
    }
    else{
       System.out.println("O valor é invalido"); 
    }
   }
   
   public double getLargura(){
       return this.largura;
   }
   public void setLargura(double largura){
    if(testeIntervalo(largura)){
      this.largura = largura;
    }
    else{
       System.out.println("O valor é invalido"); 
    }
   }
    
   private boolean testeIntervalo(double valor){
       return (valor >= 0 && valor <=20);
   }
   
   
  
   
@Override
 public String toString() {
        return String.format("\nComprimento: %f\nlargura: %f\nPerimetro: %.2f",getComprimento(), getLargura());
    }
  
     
}

