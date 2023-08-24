/*
 Realizar un programa que pida dos números enteros positivos por teclado y muestre por 
pantalla el siguiente menú:
MENU
1. Sumar
2. Restar
3. Multiplicar
4. Dividir
5. Salir
Elija opción:
El usuario deberá elegir una opción y el programa deberá mostrar el resultado por 
pantalla y luego volver al menú. El programa deberá ejecutarse hasta que se elija la 
opción 5. Tener en cuenta que, si el usuario selecciona la opción 5, en vez de salir del 
programa directamente, se debe mostrar el siguiente mensaje de confirmación: ¿Está 
seguro que desea salir del programa (S/N)? Si el usuario selecciona el carácter ‘S’ se sale 
del programa, caso contrario se vuelve a mostrar el menú
 */
package Ejerciciox11;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author JesusNjo
 */
public class Calculadora {

    Scanner input = new Scanner(System.in).useDelimiter("\n").useLocale(Locale.US);

    public void calcul() {
        int op = 0;
        int n1;
        int n2;

        do {
            System.out.println("---Ingrese la operación que desea realizar---");
            System.out.println("1:Sumar\n2:Restar\n3:Multiplicar\n4:Dividir\n5:Salir");
            op = input.nextInt();

            switch (op) {
                case 1:
                    System.out.println("Ingrese el primer digito");
                    n1 = input.nextInt();
                    System.out.println("Ingrese el segundo digito");
                    n2 = input.nextInt();
                    System.out.println("El resultado de su suma es: " + (n1 + n2));
                    break;
                case 2:
                    System.out.println("Ingrese el primer digito");
                    n1 = input.nextInt();
                    System.out.println("Ingrese el segundo digito");
                    n2 = input.nextInt();
                    if (n1 < n2) {
                        System.out.println("El primer digito debe ser mayor que el segundo");
                        break;
                    }
                    System.out.println("El resultado de su resta es es: " + (n1 - n2));
                    break;
                case 3:
                    System.out.println("Ingrese el primer digito");
                    n1 = input.nextInt();
                    System.out.println("Ingrese el segundo digito");
                    n2 = input.nextInt();
                    System.out.println("El resultado de su multiplicación es: " + (n1 * n2));
                    break;
                case 4:
                    System.out.println("Ingrese el primer digito");
                    n1 = input.nextInt();
                    System.out.println("Ingrese el segundo digito");
                    n2 = input.nextInt();
                    if (n1 < n2) {
                        System.out.println("El primer digito debe ser mayor que el segundo");
                        break;
                    }
                    System.out.println("El resultado de su division es: " + (n1 / n2));
                    break;

                case 5:
                    System.out.println("¿Está seguro de que desea salir de la calculadora? S/N");
                    String intenso = input.next();
                    if ("s".equalsIgnoreCase(intenso)) {
                        System.out.println("Hasta luego...");
                        op = 0;

                    } else {
                        System.out.println("Bienvenido de vuelva!!");
                    }
                    break;

                default:
                    System.out.println("Opcion invalida..");
            }
        } while (op != 0);
    }

}
