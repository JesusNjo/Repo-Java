/*
 Realizar un programa que rellene una matriz de tamaño NxM con valores aleatorios y
muestre la suma de sus elementos.
 */
package JavaBasico;

import java.util.Scanner;

/**
 *
 * @author JesusNjo
 */
public class EjercicioGuia44 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese el numero de filas");
        int n = input.nextInt();  //número de filas
        System.out.println("Ingrese el numero de columnas");
        int m = input.nextInt(); //número de columnas
        int sum = 0;
        int[][] matriz = new int[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matriz[i][j] = (int) (Math.random() * 10);
                sum += matriz[i][j];
            }
        }
        System.out.println("La suma de los elementos de la matriz es: " + sum);
    }

}
