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
public class ArrayConMatriz {

    
    public static void main(String[] args) {
        
        
        int[] vector = new int[2];
        int[] producto= new int[3];
        int[][]matriz = new int[2][3];
        
        
        Scanner leer = new Scanner(System.in);
        String aux ="";
        for(int i=0;i<vector.length;i++){
            System.out.println("Indique los valores del vector");
            vector[i]=leer.nextInt();
        }
        for(int i=0;i<matriz[0].length;i++){
            System.out.println("Indique los valores de la primera columna de la matriz");
            matriz[0][i] = leer.nextInt();
            
            if(i==matriz.length-1){
            for(int j = 0; j<matriz[1].length;j++){
            System.out.println("Indique los valores de la segunda columna de la matriz");
            matriz[1][j] = leer.nextInt();
            }  
            }
            
            
        }
        
        for(int elemento:vector){
                aux = aux +" " + elemento;
            }
      
      System.out.println("Los elementos del vector son:"+aux);
      
      for(int[] fila: matriz){
         
         aux= "";
         
         for(int elemento: fila){
            aux += " " + elemento; 
         }
         System.out.println("Los elementos de la matriz son:"+aux);
    }
      
    
            aux= "";
            
            System.out.println("\n* Vector * Matriz es: ");
            
            for(int elemento: producto){
                aux+= " " + elemento;
                
            }
            System.out.println(aux);
       
}
    
    
}
