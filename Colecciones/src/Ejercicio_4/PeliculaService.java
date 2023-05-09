/*
 Un cine necesita implementar un sistema en el que se puedan cargar peliculas. Para esto,
tendremos una clase Pelicula con el título, director y duración de la película (en horas).
Implemente las clases y métodos necesarios para esta situación, teniendo en cuenta lo
que se pide a continuación:
En el servicio deberemos tener un bucle que crea un objeto Pelicula pidiéndole al usuario
todos sus datos y guardándolos en el objeto Pelicula.
Después, esa Pelicula se guarda una lista de Peliculas y se le pregunta al usuario si quiere
crear otra Pelicula o no.
Después de ese bucle realizaremos las siguientes acciones:

• Mostrar en pantalla todas las películas.
• Mostrar en pantalla todas las películas con una duración mayor a 1 hora.
• Ordenar las películas de acuerdo a su duración (de mayor a menor) y mostrarlo en
pantalla.
• Ordenar las películas de acuerdo a su duración (de menor a mayor) y mostrarlo en
pantalla.
• Ordenar las películas por título, alfabéticamente y mostrarlo en pantalla.
• Ordenar las películas por director, alfabéticamente y mostrarlo en pantalla.
 */
package Ejercicio_4;

import java.util.*;

/**
 *
 * @author JesusNjo
 */
public class PeliculaService {

    Scanner input = new Scanner(System.in).useDelimiter("\n").useLocale(Locale.US);
    List<PeliculaClass> peliculaList = new ArrayList();
    ArrayList<Double> dur = new ArrayList();

    public PeliculaClass crearPelicula() {
        PeliculaClass n;;

        String op = null;

        do {
            n = new PeliculaClass();
            System.out.print("Ingrese el nombre de la pelicula: ");
            n.setTituloP(input.next());
            System.out.print("Ingrese el nombre del director: ");
            n.setDirectorP(input.next());
            System.out.print("Ingrese la duración de la pelicula: ");
            n.setDuracionP(input.nextDouble());

            peliculaList.add(n);
            System.out.println("¿Desea agregar otra pelicula? S/N");
            op = input.next();

        } while ("s".equalsIgnoreCase(op));

        for (PeliculaClass aux : peliculaList) {
            System.out.println("Pelicula: " + aux.getTituloP() + " |   Director: " + aux.getDirectorP() + " |  Duración: " + aux.getDuracionP() + "Hrs");
        }
        

        mayorAUnaHora(peliculaList);
        menorMayor(peliculaList);
        mayorMenor(peliculaList);
        tituloP(peliculaList);
        directoO(peliculaList);
        return n;

    }

    public void mayorAUnaHora(List<PeliculaClass> listP) {
        System.out.println("------Peliculas con duración mayor a 1 HORA-------");
        for (PeliculaClass aux : listP) {
            if (aux.getDuracionP() >= 1) {

                System.out.println("Pelicula: " + aux.getTituloP() + " " + aux.getDuracionP());
            }
        }
    }

    public void menorMayor(List<PeliculaClass> o) {
        System.out.println("\n");
        System.out.println("-- Peliculas ordenadas de menor a mayor duración-- ");
        
        Collections.sort(o, Comparadores.ordenar);
        
        o.forEach((x)->System.out.println(x.getDuracionP()) ) ;

    }
        public void mayorMenor(List<PeliculaClass> o) {
            System.out.println("\n");
            System.out.println("-- Peliculas ordenadas de mayor a mayor duración-- ");

            Collections.sort(o, Comparadores.ordenar.reversed());

            o.forEach((x)->System.out.println(x.getDuracionP()) ) ;

        }
        public void tituloP(List<PeliculaClass> o) {
            System.out.println("\n");
            System.out.println("-- Peliculas ordenadas por titulo-- ");

            Collections.sort(o, Comparadores.ordenart);

            o.forEach((x)->System.out.println(x.getTituloP()) ) ;

        }
        public void directoO(List<PeliculaClass> o) {
            System.out.println("\n");
            System.out.println("-- Peliculas ordenadas director-- ");

            Collections.sort(o, Comparadores.ordenard);

            o.forEach((x)->System.out.println(x.getDirectorP()) ) ;

        }
}
