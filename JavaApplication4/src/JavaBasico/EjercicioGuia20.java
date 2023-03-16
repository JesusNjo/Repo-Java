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
public class EjercicioGuia20 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner leer = new Scanner(System.in);
        int [][] matriz = new int [3][3];
        int num=0;
        
         
               
        System.out.println("Ingresa los valores de la matriz ");
        
         for (int i = 0; i <3 ; i++) {
            for (int j = 0; j < 3; j++) {
                num = leer.nextInt();
                 
                if (num>0 && num<10) {
                    
                    matriz[i][j] = num;
                    System.out.println("Usted registró el num "+num+" en la posición "+i+","+j);
                    
                } else {
                   System.out.println("Usted ingreso un número fuera de rango");

                    j--;
                }
                for(int k = 0;k<3;k++){
                }
                
              
            }
            
         }
         for(int[] fila: matriz){
         
       
         
         for(int elemento: fila){
             
            
               
         }
         
    }
         
           
         
         
    
        //Impresión de matriz
        System.out.println("MATRIZ");
        for (int j = 0; j < 3; j++) {
            for (int k = 0; k < 3; k++) {
                System.out.print(" "+matriz[j][k]+ " ");
            }
            System.out.println(" ");    
        }
        System.out.println(" "); 
    }

}
    

 