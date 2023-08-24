/*
Escribir un programa que lea un número entero por teclado y muestre por pantalla el 
doble, el triple y la raíz cuadrada de ese número. Nota: investigar la función 
Math.sqrt().
 */
package Ejercicio5;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author JesusNjo
 */
public class EnterosSQRT {
   
    Scanner input = new Scanner(System.in).useDelimiter("\n").useLocale(Locale.US);
    
    public void numero(){
        System.out.println("Ingrese el numero");
        int num = input.nextInt();
        
        System.out.println("Doble del numero "+ num*2);
        System.out.println("Triple del numero "+ num*3);
        System.out.println("Raiz cuadrada del numero "+Math.sqrt(num));
    }
    
    public double numeroPP(double n){
        
        return n;
    }
    
    
}
