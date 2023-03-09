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
public class EjercicioGuia6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int n1;
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese un numero");
        n1 = leer.nextInt();
        
        if(n1%2==0){
            System.out.println("El numero :" + n1 + " es PAR");
        }
        else{
            System.out.println("El numero :" + n1 + " NO es PAR");
        }
        
        
    }
    
}
