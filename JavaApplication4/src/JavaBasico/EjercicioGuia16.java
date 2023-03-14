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
public class EjercicioGuia16 {
  
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner leer = new Scanner(System.in);
    System.out.println("Ingrese un ");

    int tamanio = leer.nextInt();
    
    }
    
}

/*
public class Ejercicio16 {

    
    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        System.out.println("Ingrese el tamaño deseado del vector: ");
        int tamanoVector= leer.nextInt();
        System.out.println("Ingrese el número que desea bucar en el vector: ");
        int num= leer.nextInt();
        
        int[] vector = new int [tamanoVector];
        llenarVector(vector, tamanoVector);
                        
        buscarNum(vector, num, tamanoVector);

    }
    public static void llenarVector(int[] vector, int tamanoVector){
        
        for (int i = 0; i < tamanoVector; i++) {
            int num2 = (int) (Math.random()*10);
            vector[i]=num2;
            System.out.print(" " +vector[i]+ " ");
        }
    }
    
    
    public static void buscarNum(int[] vector, int num, int tamanoVector){
        int contNum = 0;
        System.out.println("");
        for (int i = 0; i < tamanoVector; i++) {
            if (vector[i]==num) {
                System.out.println("El número "+num+" se encuentra en la posición "+i+" del vector");
                contNum++;
            }
        }
        System.out.println("Y se repite "+contNum+ " veces"); 
        
        
    }
                  
}
*/