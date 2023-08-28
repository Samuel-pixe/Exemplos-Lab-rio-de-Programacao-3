
package exemplo05;


public class Aluno {
    
    private int codigo;
    private String nome;
    private double notaparcial;
    private double notafinal;
    
        public void setCodigo(int codigo){
            if(codigo>=100000 && codigo <= 999999){
                this.codigo = codigo;
            }
                else {
                        System.err.println("O codigo do aluno deve ser maior ou igual a 100000;"+"\nE menor ou igual a 999999");
                        }
            }     
        
        public void setNome(String nome){
            if(nome.length() >=5){
                this.nome = nome;
            }
                else{
                        System.err.println("O nome do aluno deve conter pelo menos"+"cinco caracteres.");
            }
        }
        
        public void setNotaParcial(double notaparcial){
            if(notaparcial>=0 && notaparcial<=10){
                this.notaparcial = notaparcial;
                 }
            else{
                 System.err.println("Nota parcial invalida.");
            }
        }
        public void setNotaFinal(double notafinal){
            if(notafinal>=0 && notafinal<=10){
                this.notafinal = notafinal;
                 }
            else{
                 System.err.println("Nota final invalida.");
            }
        }
        public int getCodigo(){
            return this.codigo;
        }
        public String getNome(){
            return this.nome;
        }
    
    
    @Override
    public String toString(){
        return String.format("\nCódigo..: %d " + "\nNome..: %s " + "\nNota parcial..: %.1f" + "\nNota final..: %.1f",
                this.codigo, 
                this.nome,
                this.notaparcial, 
                this.notafinal);
    }

}

