
package JavaBasico;

import java.util.Scanner;

/**
 *
 * @author JesusNjo
 */
public class EjercicioGuia17 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        int tamanoVector = (int) (Math.random()*50);
        int[]vector = new int [tamanoVector];
        System.out.println("El programa asignó el tamaño al vector: " +tamanoVector);        
        
        llenarVector(vector, tamanoVector);
        System.out.println(" ");
        contabilizandoNum(vector, tamanoVector);
    }
    
    public static void llenarVector(int[] vector, int tamanoVector){
        System.out.println("El vector creado es: ");
        for (int i = 0; i < tamanoVector; i++) {
            int num2 = (int) (Math.random()*100000);
            vector[i]=num2;
            System.out.print(" " +vector[i]+ " ");
        }
    }
    public static void contabilizandoNum (int[] vector, int tamanoVector){
       
        int cont1 =0;
        int cont2 =0;
        int cont3 =0;
        int cont4 =0;
        int cont5 =0;
        
        for (int i = 0; i <tamanoVector; i++) {
            String digitos = String.valueOf(vector[i]);
            
            System.out.print(digitos);
            
            switch (digitos.length()){
                case 1:
                    cont1++;
                    break;
                case 2:
                    cont2++;
                    break;
                case 3:
                    cont3++;
                    break;
                case 4:
                    cont4++;
                    break;
                case 5:
                    cont5++;
                    break;                           
            }                
            
        }
        System.out.println("");
        if (cont1>0) {
            System.out.println("El vector contiene " +cont1+ " números de 1 dígito");
         }
        if (cont2>0) {
           System.out.println("El vector contiene " +cont2+ " números de 2 dígitos"); 
        }
        if (cont3>0) {
           System.out.println("El vector contiene " +cont3+ " números de 3 dígitos"); 
        }
        if (cont4>0) {
            System.out.println("El vector contiene " +cont4+ " números de 4 dígitos");
        }
        if (cont5>0) {
            System.out.println("El vector contiene " +cont5+ " números de 5 dígitos");
        }
    }
    
}
