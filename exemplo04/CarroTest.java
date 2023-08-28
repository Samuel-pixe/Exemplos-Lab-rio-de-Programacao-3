package exemplo04;

import javax.swing.JOptionPane;

public class CarroTest {
    public static void main(String[] args) {
        
//Criação de um objeto da classe Carro    
        Carro fusca = new Carro();
                fusca.marca = "VW";
                fusca.modelo = "Fusca";
                fusca.anoFabricacao = 1966;
                fusca.velocidadeAtual = 0;
                
//Outro obj                
        Carro brasilia = new Carro();
                brasilia.marca = "VW";
                brasilia.modelo = "Brasilia";
                brasilia.anoFabricacao = 1975;
                brasilia.velocidadeAtual = 0;
                
                fusca.acelerar();
                fusca.acelerar();
                fusca.acelerar();
                fusca.acelerar();
                fusca.acelerar();
                fusca.frear();
                
                for (int i = 1; i <= 120; i++) {
            brasilia.acelerar();
            
        }
                //System.out.println("Velocidade: "+ fusca.velocidadeAtual);
                //System.out.println("Velocidade: "+ brasilia.velocidadeAtual);
                fusca.msg();
                brasilia.msg();
                
                
    }
}
