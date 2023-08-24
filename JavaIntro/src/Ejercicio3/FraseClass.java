/*
Escribir un programa que pida una frase y la muestre toda en mayúsculas y después toda 
en minúsculas. Nota: investigar la función toUpperCase() y toLowerCase() en 
Java.
 */
package Ejercicio3;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author JesusNjo
 */
public class FraseClass {
    Scanner input = new Scanner(System.in).useDelimiter("\n").useLocale(Locale.US);
    
    
    public void crearFrase(){
        System.out.println("Ingrese su frase");
        String frase = input.next();
        
        System.out.println("Frase en MAYUSCULAS: "+frase.toUpperCase());
        System.out.println("Frase en minusculas: "+frase.toLowerCase());
    }
}
