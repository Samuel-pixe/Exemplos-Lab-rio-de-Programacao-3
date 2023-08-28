
/*package exemplo05;


public class Televisor {
    
    private int volume;
    private int canal;
   
    
    public void setVolume(){
        if(volume<=100 && volume>=0){
        this.volume= volume;
        }
        else{
            System.err.println("Não é possivel aumentar o volume.");
        }
        
    }
   /* public void reduzirVolue(){
        if(volume>0 || volume<=100){
        this.volume = volume;
        }
        else{
            System.err.println("Não é possivel diminuir o volume.");
        }
        }
    
    public void trocarCanal(){
        if(canal<=100 && canal>=0){
        this.canal = canal;
        }
        else{
            System.err.println("Canal inválido.");
        }
    }
    
   @Override
    public String toString(){
        return String.format("\nCanal:,
);
    }
}*/
package exemplo05;

public class Televisor {
    
    private int volume;
    private int canal;
    
    public void setVolume(int volume){
        if (volume>=0 && volume <=100){
            this.volume = volume;
        }else{
            System.err.println("Volume inválido.");
        }
    }
    
    public void setCanal(int canal){
        if(canal>=1 && canal <= 200){
            this.canal = canal;
        }else{
            System.err.println("Canal inválido.");
        }
    }
    
    public int getVolume(){
        return this.volume;
    }
    
    public int getCanal(){
        return this.canal;
    }
    
    public void aumentarVolume(){
        this.setVolume(this.getVolume()+1);
    }
    
    public void reduzirVolume(){
        this.setVolume(this.getVolume()-1);
    }
    
    public void trocarCanal(int canal){
        this.setCanal(canal);
    }
    
    @Override
    public String toString(){
        return String.format(
            "\nCanal.: %d" +
            "\nVolume: %d", 
            this.getCanal(),this.getVolume()
        );
    }
    
}

    
            
            

