
package Exemplo06;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;



public class Musica {
    
    private String titulo;
    private String nome;
    private String album;
    
    
public String getAlbum(){
    return this.album;
}

public void setAlbum(String album){
    this.album=album;
}
    
public String getTitulo(){
    return this.titulo;
}

public void setTitulo(String titulo){
    this.titulo=titulo;
}
    
public void setNome(String nome){
        this.nome = nome;
    }
   
public String getNome(){
        return this.nome;
    }
//public String getTime(){
//    return this.time;
//}

//
//    public void setTime(){
//  LocalTime time = LocalTime.of(40, 2);
////        System.out.println(time2);
//}

     

    @Override
 public String toString() {
        return String.format("\nArtista: %s \nAlbum: %s \nMusica: %s\n",getNome(),getAlbum(), getTitulo());
    }
  
     
}
    

