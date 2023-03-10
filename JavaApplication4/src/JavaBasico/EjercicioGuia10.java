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
public class EjercicioGuia10 {

   
  public static void main(String[] args) {
        int lim,suma,num;
        
        suma = 0;
        
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese un límite positivo:");
        lim = leer.nextInt();
        
        do {
            
        System.out.println("Ingrese un número:");
        num = leer.nextInt();
        suma = suma + num;
        
        } while (suma <= lim);
        
        System.out.println("Se superó el límite positivo");
    }
    
}
    
/*public static void main(String[] args) {
        int lim,suma,num;
        
        suma = 0;
        
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese un límite positivo:");
        lim = leer.nextInt();
        
        for (int i = 0; i <= lim; i++) {
            System.out.println("Ingrese un número:");
            num = leer.nextInt();
            suma += num;
            if(suma > lim){
                break;
            }
        }
        
        System.out.println("Se superó el límite positivo");
    }
   */


