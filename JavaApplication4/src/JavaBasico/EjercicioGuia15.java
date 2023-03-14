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
public class EjercicioGuia15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        int[] vec = new int[100];
        Scanner leer = new Scanner(System.in);
        
        
        for(int i = 0; i<100; i++){

         vec[i] = i + 1;
        }
        
        for(int i=vec.length - 1; i >= 0;i--)
       System.out.println(vec[i]);

    }
    
}
