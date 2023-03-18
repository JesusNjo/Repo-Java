
package JavaBasico;
/*Recorrer un vector de N enteros contabilizando cuántos números son de 1 dígito, cuántos
de 2 dígitos, etcétera (hasta 5 dígitos).*/
import java.util.Scanner;

/**
 *
 * @author JesusNjo
 */
public class EjercicioGuia17 {
    public static void main(String[] args) {
    
    
    Scanner leer = new Scanner(System.in);
    int n= 0;
    System.out.println("Ingrese el tamaño de su vector");
    n=leer.nextInt();
    int[] vector = new int[n];
    String aux; 
    int cont1=0,cont2=0,cont3=0,cont4=0,cont5=0;
    
    
    for(int i=0;i<vector.length;i++){
        vector[i] = (int) (99999*Math.random());
        
        System.out.print(" [" +vector[i]+ "] ");
        
        System.out.println();
       
    }
   
        for (int i = 0; i <vector.length; i++) {
         aux = Integer.toString(vector[i]);
         
            switch(aux.length()){
                
                case 1: cont1++;break;
                case 2: cont2++;break;
                case 3: cont3++;break;
                case 4: cont4++;break;
                case 5: cont5++;break;
            }

        }
        System.out.println("Digitos de uno hay: "+cont1);
        System.out.println("Digitos de dos hay: "+cont2);
        System.out.println("Digitos de tres hay: "+cont3);
        System.out.println("Digitos de cuatro hay: "+cont4);
        System.out.println("Digitos de cinco hay: "+cont5);
}}
