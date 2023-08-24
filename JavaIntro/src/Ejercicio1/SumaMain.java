/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio1;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author JesusNjo
 */
public class SumaMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in).useDelimiter("\n").useLocale(Locale.US);
        Suma suma = new Suma();
        
        
        System.out.println("Ingrese el primer digito");
        int n1 = input.nextInt();
        System.out.println("Ingrese el segundp digito");
        int n2 = input.nextInt();
        
        System.out.println(n1 + " + "+n2+ " ="+suma.suma(n1,n2));
        
        
       
    }
    
}
