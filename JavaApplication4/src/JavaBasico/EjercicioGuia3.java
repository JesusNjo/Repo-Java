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
public class EjercicioGuia3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String frase;
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese su frase");
        frase = leer.nextLine();
        
        System.out.println("Su frase mayúscula es: "+ frase.toUpperCase());
        System.out.println("Su frase minúscula es: "+ frase.toLowerCase());
        
        
    }
    
}
