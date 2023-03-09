/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaBasico;

import java.util.Scanner;

/**
 *
 * @author JesusNjo
 */
public class DatosPrueba {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner (System.in);
        
        int a;
        int b;
        double resultado;
        
        boolean compar;
        
        System.out.println("Ingrese Primer numero");
        a=leer.nextInt();
        
        System.out.println("Ingrese el Segundo numero");
        b= leer.nextInt();
        
        System.out.println(compar = a > b);
        compar = a <b;

       
        String nombre;
        int edad;
        
        System.out.println("Ingrese su nombre");
        nombre= leer.next();
        System.out.println("Ingrese su edad");
        edad=leer.nextInt();
        
        System.out.println("Su nombre es: "+ nombre + " Y tiene: " + edad);
        
    }
    
}
