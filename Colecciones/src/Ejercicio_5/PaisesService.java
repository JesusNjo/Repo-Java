/*
Se requiere un programa que lea y guarde países, y para evitar que se ingresen repetidos
usaremos un conjunto. El programa pedirá un país en un bucle, se guardará el país en el
conjunto y después se le preguntará al usuario si quiere guardar otro país o si quiere salir,
si decide salir, se mostrará todos los países guardados en el conjunto. (Recordemos hacer
los servicios en la clase correspondiente)
Después deberemos mostrar el conjunto ordenado alfabéticamente: para esto recordar
cómo se ordena un conjunto.


Por último, al usuario se le pedirá un país y se recorrerá el conjunto con un Iterator, se
buscará el país en el conjunto y si está en el conjunto se eliminará el país que ingresó el
usuario y se mostrará el conjunto. Si el país no se encuentra en el conjunto se le informará
al usuario.
 */
package Ejercicio_5;

import java.util.*;

/**
 *
 * @author JesusNjo
 */
public class PaisesService {

    Scanner input = new Scanner(System.in).useDelimiter("\n").useLocale(Locale.US);
    Set<String> paises = new TreeSet();

    public PaisesClass ingresarPais() {
        PaisesClass p = new PaisesClass();
        String op = null;

        do {
            System.out.println("Ingrese un pais");

            p.setPaises(input.next());

            System.out.println("Desea agregar otro pais? S/N");

            paises.add(p.getPaises());

            p.setPaisR(paises);

            op = input.next();
        } while ("s".equalsIgnoreCase(op));

        System.out.println(p.getPaisR().size());
        p.getPaisR().forEach((x) -> System.out.println(x));

        System.out.println("Ingrese el pais to seek and destroy");
        String busc = input.next();

        recorrerYEliminar(busc);

        System.out.println("----Lista actualizada----");
        p.getPaisR().forEach((x) -> System.out.println(x));
        
       

        return p;
    }

    public void recorrerYEliminar(String buscar) {

        boolean confirm = true;

        Iterator<String> it = paises.iterator();

        while (it.hasNext()) {

            String aux = it.next();

            if (aux.equalsIgnoreCase(buscar)) {
                it.remove();
                confirm = false;
            }
        }
        
        if (confirm) {
            System.out.println("Ese pais no se encuentra en la base de datos D:");
        }
    }
}
