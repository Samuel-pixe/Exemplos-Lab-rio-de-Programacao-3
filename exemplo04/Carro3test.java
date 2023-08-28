
package exemplo04;

import java.util.ArrayList;
import java.util.List;

public class Carro3test {
    public static void main(String[] args) {
        //Lista dinâmica de objetos Carros 
        List<Carro> lista = new ArrayList<>();
        
        for (int i = 0; i < 10; i++) {
            Carro obj = new Carro();
            obj.marca = "Marca" + (i+1);
            obj.modelo = "Modelo" + (i+1); 
            obj.anoFabricacao = 1960+(int)(Math.random()*10);
            obj.velocidadeAtual =(int)(Math.random()*120);
            
            //Adicionar um objeto a lista dinamica
            lista.add(obj);
    }
        //Percorrer o objeto na lista dinâmica
        for (Carro c : lista){//Para cada carro contido na lista 
            System.out.println(c);
        }
    
    }
}
