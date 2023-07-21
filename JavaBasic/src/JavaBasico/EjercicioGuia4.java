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
public class EjercicioGuia4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        double c = 0;
        
        
        Scanner leer = new Scanner(System.in);
        double f;
        
        System.out.println("Ingrese la cantidad de º celcios");
        c=leer.nextInt();
        f= 32 + (9 * c / 5);
        System.out.println("La cantidad de farengei en Celcios es: "+f);
    }
    
}
