/*
 Crea una aplicación que nos pida un número por teclado y con una función se lo pasamos
por parámetro para que nos indique si es o no un número primo, debe devolver true si es
primo, sino false.
Un número primo es aquel solo puede dividirse entre 1 y si mismo. Por ejemplo: 25 no es
primo, ya que 25 es divisible entre 5, sin embargo, 17 si es primo.
 */
package JavaBasico;

import java.util.Scanner;

/**
 *
 * @author JesusNjo
 */
public class EjercicioGuia38 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int n;
        int contador = 0;

        System.out.println("Indique su numero");
        n = leer.nextInt();

        if (n <= 1) {
            System.out.println("Numero NO valido");

        }
        if (n == 2) {
            System.out.println("El numero 2 ES primo");
        } else {

            for (int i = 2; i < n; i++) {
                if (n % i == 0) {
                    contador++;
                    System.out.println("El numero: " + n + " no es primo");
                    break;
                }
            }
        }
        if (contador == 0) {
            System.out.println("El numero " + n + " ES primo");
        }
    }

}
