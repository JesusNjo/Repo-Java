/*
Crear un programa que pida una frase y si esa frase es igual a “eureka” el programa 
pondrá un mensaje de Correcto, sino mostrará un mensaje de Incorrecto. Nota: 
investigar la función equals() en Java.

 */
package Ejercicio7;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author JesusNjo
 */
public class EurekaClass {

    Scanner input = new Scanner(System.in).useDelimiter("\n").useLocale(Locale.US);

    public void eureka() {
        String frase = null;

        while (!"eureka".equals(frase)) {
            System.out.println("Ingrese la frase");
            frase = input.next();

            if ("eureka".equalsIgnoreCase(frase)) {
                System.out.println("FRASE CORRECTA, EUREKA!!");
            } else {
                System.out.println("Frase incorrecta, vuelva a intentarlo..");
            }
        }
    }
}
