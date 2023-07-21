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
public class EjercicioGuia7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        String frase;
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese la frase");
        frase = leer.nextLine();
        
        if("eureka".equalsIgnoreCase(frase)){
            System.out.println("Frase correcta");
        }else{
            System.out.println("Frase INCORRECTA");
        }
    }
    
}
