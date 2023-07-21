/*
Realice un programa que calcule y visualice el valor máximo, el valor mínimo y el 
promedio de n números (n>0). El valor de n se solicitará al principio del programa y los 
números serán introducidos por el usuario. Realice dos versiones del programa, una 
usando el bucle “while” y otra con el bucle “do - while”.

 */
package JavaBasico;

import java.util.Scanner;

/**
 *
 * @author JesusNjo
 */
public class EjercicioGuia28 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int n = 0;
        int aux= 0;
        int aux2= 99999;
        
        Scanner leer = new Scanner(System.in);
        System.out.println("PARA SALIR DEL SISTEMA PRESIONE 0");
        System.out.println("Ingrese los valores de N");
       
      
        do {
            n = leer.nextInt();
            
            
            if(aux < n && n !=0){
                aux= n;
                System.out.println("Numero máximo es: "+ aux);
                
            }if(aux2>n && n !=0){
                aux2=n;
             System.out.println("Numero mínimo es: "+ aux2);

            }
            System.out.println("Max: "+aux +" Min: " + aux2);

            
        } while (n != 0);
         System.out.println("Ha salido del sistema. Número máximo ingresado es: "+aux);
         System.out.println("Número mínimo ingresado es: "+aux2);
         
         
         System.out.println("----------------------");
         System.out.println("Ingrese la cantidad de digitos que verificará");
         int rango = 0;
         rango = leer.nextInt();
         int contador=0;
         while(contador<rango){
           System.out.println("Ingrese los valores de N en WHILE");
           n = leer.nextInt();
           if(aux < n){
                aux= n;
                System.out.println("Numero máximo en el WHILE es: "+ aux);
            }if(aux2>n && n !=0){
                aux2=n;
             System.out.println("Numero mínimo en el WHILE es: "+ aux2);

            }
            System.out.println("WHILE Max: "+aux +" WHILE Min: " + aux2);
            contador++;
    }
    
    
    
    
}

}
