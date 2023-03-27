/*
Crea una aplicación que nos pida un número por teclado y con una función se lo pasamos
por parámetro para que nos indique si es o no un número primo, debe devolver true si es
primo, sino false.
Un número primo es aquel solo puede dividirse entre 1 y si mismo. Por ejemplo: 25 no es
primo, ya que 25 es divisible entre 5, sin embargo, 17 si es primo.
¿Qué son los números primos?
Básicamente, un número primo es un número natural que tiene solo dos divisores o
factores: 1 y el mismo número. Es decir, es primo aquel número que se puede dividir
por uno y por el mismo número.
El primer número primo es 2, y hay 25 números primos entre 1 y 100, ellos son: 2, 3, 5,
7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89 y 97.
 */
package JavaBasico;

import java.util.Scanner;

/**
 *
 * @author JesusNjo
 */
public class EjercicioGuia40 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n1;
        System.out.println("Ingrese su numero");
        n1 = input.nextInt();
        boolean resultado = parametros(n1);
        System.out.println(resultado);

    }

    public static boolean parametros(int n1) {
        int contador = 0;
        boolean calificador = false;

        if (n1 <= 1) {
            System.out.println("El numero ingresado debe ser mayor a 1");
        } else {
            if (n1 == 2) {
                calificador = true;

            }
            for (int i = 2; i < n1; i++) {

                if (n1 % i == 0) {

                    contador++;
                    calificador = false;
                    break;
                }
            }

        }

        if (contador == 0 && n1 != 2) {
            calificador = true;

        }
        return calificador;
    }

}
