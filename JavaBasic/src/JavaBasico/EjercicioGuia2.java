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
public class EjercicioGuia2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       String name= "";
       
       System.out.print(nombre(name));
    }
    public static String nombre(String nombre){
        
       String name;
        
       Scanner leer = new Scanner(System.in);
       System.out.print("Ingrese su nombre: ");
       name=leer.next();
        
        return name;
    }
    
}
