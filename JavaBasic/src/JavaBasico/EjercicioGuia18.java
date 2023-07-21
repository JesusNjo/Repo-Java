/*
Realizar un programa que rellene un matriz de 4 x 4 de valores aleatorios y muestre la
traspuesta de la matriz. La matriz traspuesta de una matriz A se denota por B y se
obtiene cambiando sus filas por columnas (o viceversa).
 */
package JavaBasico;

import java.util.Scanner;


public class EjercicioGuia18 {
public static void main(String[] args) {
   
    Scanner leer = new Scanner(System.in);
    
    int n,m;
    System.out.println("Indique el ancho y largo de su matriz(DEL MISMO RANGO)");
    n= leer.nextInt();
    m= leer.nextInt();
    int[][] matrizA = new int[n][m];
    int[][] matrizB = new int[n][m];


    for (int i = 0; i <n; i++) {
        for (int j = 0; j <m; j++) {
            matrizA[i][j] = (int) (Math.random() * 100);
            matrizB[j][i] = matrizA[i][j];
            
            System.out.print("["+matrizA[i][j]+"]");
        }
        System.out.println();
    }
    System.out.println("----------------");
    
    
    
    for (int i = 0; i < n; i++) {
        for (int h = 0;h  < m; h++) {
            
            matrizB[h][i] = matrizA[h][i];
            
            System.out.print("["+matrizB[h][i]+"]");
        }
        System.out.println();
    }
    

    }
   
}  
