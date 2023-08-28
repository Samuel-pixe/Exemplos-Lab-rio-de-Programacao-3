
package exemplo03;

public class ExemploVetoresMatrizes {
    public static void main(String[] args) {
         int vet [] = new int [10];
         for (int i = 0; i < vet.length; i++) {
            vet[i] = (int)(Math.random()*100);        
        }
         for (int i = 0; i < vet.length; i++) {
             System.out.println(String.format("[%d]=%d",i, vet[i]));       
        }
         int mat[][]=new int[3][4];
         for (int i = 0; i < mat.length; i++) {
             for (int j = 0; j < mat[i].length; j++) {
                 mat[i][j]= (int)(Math.random()*10);
                 }   
        }
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                System.out.print(mat[i][j]+"\t");
          }
            System.out.println("");
       
        }
         
    }
}
