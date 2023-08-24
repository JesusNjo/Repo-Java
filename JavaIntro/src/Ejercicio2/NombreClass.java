/*
 Escribir un programa que pida tu nombre, lo guarde en una variable y lo muestre por 
pantalla
 */
package Ejercicio2;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author JesusNjo
 */
public class NombreClass {
    Scanner input = new Scanner(System.in).useDelimiter("\n").useLocale(Locale.US);
    
    
    public void nombre(){
        System.out.println("Cual es tu nombre?");
        String nombre = input.next();
        
        System.out.println("Su nombre es "+nombre);
    }
}
