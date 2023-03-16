/*
Elaborar un algoritmo en el cuál se ingrese un número entre 1 y 10 y se muestre su
equivalente en romano.
 */
package JavaBasico;

import java.util.Scanner;

/**
 *
 * @author JesusNjo
 */
public class EjercicioGuia25 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int num = 0;

        Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese un numero entre 1 y 10");
        num = leer.nextInt();
        switch (num) {
            case 1:
                System.out.println("El numero 1 en romano es:" + " I");
                break;
            case 2:
                System.out.println("El numero 2 en romano es:" + " II");
                break;
            case 3:
                System.out.println("El numero 3 en romano es:" + " III");
                break;
            case 4:
                System.out.println("El numero 4 en romano es:" + " IV");
                break;
            case 5:
                System.out.println("El numero 5 en romano es:" + " V");
                break;
            case 6:
                System.out.println("El numero 6 en romano es:" + " VI");
                break;
            case 7:
                System.out.println("El numero 7 en romano es:" + " VII");
                break;
            case 8:
                System.out.println("El numero 8 en romano es:" + " VIII");
                break;
            case 9:
                System.out.println("El numero 9 en romano es:" + " IV");
                break;
            case 10:
                System.out.println("El numero 10 en romano es:" + " X");
                break;
            default:
                System.out.println("Numero fuera de rango");
        }
    }

}
