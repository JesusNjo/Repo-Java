package JavaBasico;

import java.util.Scanner;

/**
 *
 * @author JesusNjo
 */
public class Condicionales {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un numero");
        int n1 = leer.nextInt();
        System.out.println("Ingrese un numero");
        int n2 = leer.nextInt();
        
       if(n1>25){
           System.out.println("El numero "+n1+ " es mayor a 25");
       }if(n2>25){
           System.out.println("El numero "+n2+ " es mayor a 25");
       
       }if(n1>25 && n2>25){
       System.out.println("Ambos valores son mayores a 25");
       }if(n1<25 && n2<25){
       System.out.println("Ambos numero son menores a 25");
       }else if(n1<25 || n2<25){
        System.out.println("Uno o ambos son menores a 25");
       }
    }
    
}