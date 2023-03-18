/*
Realizar un algoritmo que rellene un vector de tamaño N con valores aleatorios y le pida
al usuario un numero a buscar en el vector. El programa mostrará donde se encuentra el
numero y si se encuentra repetido
 */
package JavaBasico;

import java.util.Scanner;

/**
 *
 * @author JesusNjo
 */
public class EjercicioGuia16 {
    
 

    
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int n = 0;
        System.out.println("Indique el tamaño de su vector");
        n = leer.nextInt();

        int num2= 0;
        int[] vector = new int[n];
        int contador= 0;
        for(int i=0; i<n;i++){
            vector[i] = (int) (Math.random()*500);
            System.out.print(" [" +vector[i]+ "] ");
            System.out.println();
            
            
        }
        System.out.println("Indique el valor a buscar en su vector");
        num2 = leer.nextInt();
        for(int j = 0; j<n;j++){
           if(vector[j] == num2){
               System.out.println("El numero "+num2+" se encuentra en la posición "+(j+1));
               contador++;
               
           }
         }
           System.out.println("El numero se repite "+contador+" veces");
        
    }
}              








   //Scanner leer = new Scanner (System.in);
//        System.out.println("Ingrese el tamaño deseado del vector: ");
//        int tamanoVector= leer.nextInt();
//        System.out.println("Ingrese el número que desea bucar en el vector: ");
//        int num= leer.nextInt();
//        
//        int[] vector = new int [tamanoVector];
//        llenarVector(vector, tamanoVector);
//                        
//        buscarNum(vector, num, tamanoVector);
//
//    }
//    public static void llenarVector(int[] vector, int tamanoVector){
//        
//        for (int i = 0; i < tamanoVector; i++) {
//            int num2 = (int) (Math.random()*10);
//            vector[i]=num2;
//            System.out.print(" " +vector[i]+ " ");
//        }
//    }
//    
//    
//    public static void buscarNum(int[] vector, int num, int tamanoVector){
//        int contNum = 0;
//        System.out.println("");
//        for (int i = 0; i < tamanoVector; i++) {
//            if (vector[i]==num) {
//                System.out.println("El número "+num+" se encuentra en la posición "+i+" del vector");
//                contNum++;
//            }
//        }
//        System.out.println("Y se repite "+contNum+ " veces"); 