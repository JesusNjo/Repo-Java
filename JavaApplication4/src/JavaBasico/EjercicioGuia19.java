
package JavaBasico;


public class EjercicioGuia19 {

     
    public static void main(String[] args) {
        
        int[][] matrizA = new int[3][3];
        int[][] matrizB = new int[3][3];
        matrizA[0][0]= 0;
        matrizA[0][1]= 2;
        matrizA[0][2]= -4;
        matrizA[1][0]= -2;
        matrizA[1][1]= 0;
        matrizA[1][2]= -2;
        matrizA[2][0]= 4;
        matrizA[2][1]= 2;
        matrizA[2][2]= 0;
        
        for(int i= 0; i<3;i++){
            for(int j = 0; j<3;j++){
                matrizB[j][i] = matrizA[i][j];
                
                System.out.print("["+matrizA[i][j]+"]");
                
            }
            System.out.println("");
    }
            System.out.println("");
            
            for(int i = 0; i<3;i++){
                 for(int j = 0; j<3;j++){
                    matrizA[j][i] = matrizB[i][j];
                    System.out.print("["+matrizB[i][j]+"]");
                 }
                  System.out.println("");
            }
            int contador = 0;
            for(int i = 0; i<3; i++){
                for(int j=0; j<3; j++){
                    
                    if(matrizA[i][j] + matrizB[i][j] == 0){
                        contador++;
                    }
                        
                    
                }
            }
            if(contador ==4){
                System.out.println("Matriz anti simetrica");
            }else{
                System.out.println("Matriz NO simetrica");
            }
    }
    
}
