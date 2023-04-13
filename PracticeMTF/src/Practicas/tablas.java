/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Practicas;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author JesusNjo
 */
public class tablas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int op;

        do {
            Scanner input = new Scanner(System.in).useDelimiter("\n").useLocale(Locale.US);
            System.out.println("Eligue la tabla que deseas trabajar: \n1 - 2 - 3 - 4 - 5 - 6 - 7 - 8 - 9");
            System.out.println("Marque 0 si desea salir del menu");

            op = input.nextInt();
            if (op >= 1 && op < 10) {
                for (int i = 1; i <= 10; i++) {
                    int n1 = op;
                    int n2 = i;
                    System.out.println("Cuanto es: " + op + "x" + i);
                    int resultado = input.nextInt();
                    if (resultado == n1 * n2) {
                        System.out.println("Resultado correcto");
                    } else {
                        System.out.println("Incorrecto!. Intente de nuevo");
                        i--;
                    }
                }
            }

        } while (op != 0);
        System.out.println("Salio del menú de las tablas");
    }

}
