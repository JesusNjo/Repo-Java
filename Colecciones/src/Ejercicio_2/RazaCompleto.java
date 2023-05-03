/*
Diseñar un programa que lea y guarde razas de perros en un ArrayList de tipo String. El
programa pedirá una raza de perro en un bucle, el mismo se guardará en la lista y
después se le preguntará al usuario si quiere guardar otro perro o si quiere salir. Si decide
salir, se mostrará todos los perros guardados en el ArrayList.

Continuando el ejercicio anterior, después de mostrar los perros, al usuario se le pedirá
un perro y se recorrerá la lista con un Iterator, se buscará el perro en la lista. Si el perro
está en la lista, se eliminará el perro que ingresó el usuario y se mostrará la lista
ordenada. Si el perro no se encuentra en la lista, se le informará al usuario y se mostrará
la lista ordenada.
 */
package Ejercicio_2;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author JesusNjo
 */
public class RazaCompleto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in).useDelimiter("\n").useLocale(Locale.US);
        List<String> perros = new ArrayList();

        String op = "";
        System.out.println("Ingrese la raza que desea agregar");
        String dog = input.next();
        perros.add(dog);
        do {
            System.out.println("¿Desea agregar una nueva raza? S/N");
            op = input.next();

            if ("s".equalsIgnoreCase(op)) {
                System.out.println("Ingrese la raza nueva a agregar");
                String nuevoP = input.next();

                perros.add(nuevoP);
            }
        } while ("S".equalsIgnoreCase(op));
        System.out.println("Lista de las razas");
        perros.forEach((x) -> System.out.print(x + " | "));
        System.out.println();

        Iterator<String> it = perros.iterator();
        System.out.println("Ingrese la raza que desea eliminar");
        String dogN = input.next();

        while (it.hasNext()) {
            String aux = it.next();
            
            if (dogN.equalsIgnoreCase(aux)) {
                it.remove();
            }else{
                System.out.println("La raza "+dogN+" no existe o no está incluida en su lista..");
                break;
            }
        }
        System.out.println("Lista actualizada");
        Collections.sort(perros);
        perros.forEach((x) -> System.out.print(x + " | "));
    }

}
