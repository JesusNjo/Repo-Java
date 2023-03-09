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
public class EjercicioGuia5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n1= 0;
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese un numero");
        n1 = leer.nextInt();
        
        
        System.out.println("El numero 2ble es: " +(n1*2));
        System.out.println("El numero 2ble es: " +(n1*3));
        System.out.println("El numero la raíz es : " +Math.sqrt(n1));
    }
    
}
