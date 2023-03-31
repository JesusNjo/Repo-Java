/*
Construya un programa que lea 5 palabras de mínimo 3 y hasta 5 caracteres y, a medida
que el usuario las va ingresando, construya una “sopa de letras para niños” de tamaño de
20 x 20 caracteres. Las palabras se ubicarán todas en orden horizontal en una fila que
será seleccionada de manera aleatoria. Una vez concluida la ubicación de las palabras,
rellene los espacios no utilizados con un número aleatorio del 0 al 9. Finalmente imprima
por pantalla la sopa de letras creada.
Nota: Para resolver el ejercicio deberá investigar cómo se utilizan las siguientes funciones
de Java substring(), Length() y Math.random().
 */
package JavaBasico;

import java.util.Scanner;

/**
 *
 * @author JesusNjo
 */
import java.util.Random;

public class EjercicioGuia45 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] palabras = new String[5];
        System.out.println("Ingrese palabra con caracteres (DE 3 A 5)");
        palabras[0] = input.next();
        palabras[1] = input.next();
        palabras[2] = input.next();
        palabras[3] = input.next();
        palabras[4] = input.next();

        char[][] sopaDeLetras = new char[20][20];

        Random rand = new Random();
        int filaSeleccionada = rand.nextInt(20);
        System.out.println(filaSeleccionada);
        
        for (int i = 0; i < palabras.length; i++) {
         
            String palabraActual = palabras[i];
            int longitudPalabraActual = palabraActual.length();
            int inicioSubcadena = rand.nextInt(20 - longitudPalabraActual);
            String subcadenaActual = palabraActual.substring(0, longitudPalabraActual);
            for (int j = 0; j < longitudPalabraActual; j++) {
                sopaDeLetras[filaSeleccionada][inicioSubcadena + j] = subcadenaActual.charAt(j);
            }
        }

        for (int i = 0; i < sopaDeLetras.length; i++) {
            for (int j = 0; j < sopaDeLetras[i].length; j++) {
                if (sopaDeLetras[i][j] == '\u0000') {
                    sopaDeLetras[i][j] = (char) (rand.nextInt(10) + '0');
                }
                System.out.print(sopaDeLetras[i][j] + " ");
            }
            System.out.println();
        }
    }
}


