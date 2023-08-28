
package exemplo04;


public class Carro2test {
    public static void main(String[] args) {
        Carro carros[] = new Carro [3];
        
        for (int i = 0; i < carros.length; i++) {
            carros[i] = new Carro();
            carros[i].marca = "Marca" + (i+1);
            carros[i].modelo = "Modelo" + (i+1); 
            carros[i].anoFabricacao = 1960+(int)(Math.random()*10);
            carros[i].velocidadeAtual =(int)(Math.random()*120);
            
            //System.out.println(carros[i].toString());
            System.out.println(carros[i]);
            //carros[i].msg();
        }
    }
}
