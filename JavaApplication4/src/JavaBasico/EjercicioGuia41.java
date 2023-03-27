/*
Escriba un programa que averigüe si dos vectores de N enteros son iguales (la
comparación deberá detenerse en cuanto se detecte alguna diferencia entre los
elementos).
 */
package JavaBasico;

import java.util.Scanner;

/**
 *
 * @author JesusNjo
 */
public class EjercicioGuia41 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n;
        System.out.println("Ingrese el tamaño los vectors");
        n = input.nextInt();
        int[] vec1 = new int[n];
        int[] vec2 = new int[n];

        System.out.println("Ingrese los valores del vector");
        for (int i = 0; i < n; i++) {
            vec1[i] = input.nextInt();
            vec2[i] = input.nextInt();

        }
        for (int i = 0; i < n; i++) {
            if (vec1[i] == vec2[i]) {

                System.out.println("Son iguales");
            } else {
                System.out.println("Se encontró un elemento diferente");
                break;
            }
        }
    }

}
