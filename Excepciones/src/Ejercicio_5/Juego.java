/*
Escribir un programa en Java que juegue con el usuario a adivinar un número. La computadora
debe generar un número aleatorio entre 1 y 500, y el usuario tiene que intentar adivinarlo. Para
ello, cada vez que el usuario introduce un valor, la computadora debe decirle al usuario si el
número que tiene que adivinar es mayor o menor que el que ha introducido el usuario. Cuando
consiga adivinarlo, debe indicárselo e imprimir en pantalla el número de veces que el usuario
ha intentado adivinar el número. Si el usuario introduce algo que no es un número, se debe
controlar esa excepción e indicarlo por pantalla. En este último caso también se debe contar el
carácter fallido como un intento.
 */
package Ejercicio_5;

import java.util.*;

/**
 *
 * @author JesusNjo
 */
public class Juego {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {

        capturarNum();

    }

    public static void capturarNum() throws Exception {
        Scanner input = new Scanner(System.in).useDelimiter("\n").useLocale(Locale.US);
        int numAleatorio = (int) ((Math.random() * 500) + 1);
        int num = 0;

        do {
            try {
                System.out.println("Indique un valor entre 1 y 500");
                num = input.nextInt();
                System.out.println(numAleatorio);
                throw (numAleatorio > num) ? new Menor("El numero es menor") : (numAleatorio < num) ? new Mayor("El numero es mayor") : new Igual("Adivinaste");
            } catch (InputMismatchException e) {
                System.out.println("No puedes ingresar letras");
                System.out.println(e.toString());
                break;
            } catch (Mayor | Menor | Igual a) {
                System.out.println(a.getMessage());
                
            }

        } while (num != numAleatorio);

    }

}
