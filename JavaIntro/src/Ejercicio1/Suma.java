/*
Escribir un programa que pida dos números enteros por teclado y calcule la suma de los 
dos. El programa deberá después mostrar el resultado de la suma
 */
package Ejercicio1;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author JesusNjo
 */
public class Suma {
    Scanner input = new Scanner(System.in).useDelimiter("\n").useLocale(Locale.US);
    
    public int suma(int n1,int n2){
        
        return n1+n2;
    }
    
}
