/*
Dada una cantidad de grados centígrados se debe mostrar su equivalente en grados 
Fahrenheit. La fórmula correspondiente es: F = 32 + (9 * C / 5).
 */
package Ejercicio4;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author JesusNjo
 */
public class GradosClass {
    Scanner input = new Scanner(System.in).useDelimiter("\n").useLocale(Locale.US);
    
    
    public void grados(){
        System.out.println("Indique la cantidad de grados centigrados º");
        double grados = input.nextInt();
        
        double gradosF = 32 + (9*grados/5);
        
        System.out.println("Grados CENTIGRADOS: "+grados);
        System.out.println("Grados Fahrenheit: "+gradosF);
    }
    
}
