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

22

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

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author JesusNjo
 */
public class CineService {

    Scanner input = new Scanner(System.in).useDelimiter("\n").useLocale(Locale.US);

    public ArrayList<CineClass> crearPelicula() {

        CineClass peli = new CineClass();
        ArrayList<CineClass> peliculaC = new ArrayList();
        ArrayList<String> peliculaT = new ArrayList();
        ArrayList<String> peliculaD = new ArrayList();
        ArrayList<Double> peliculaH = new ArrayList();

        String op = "";
        do {
            System.out.println("Ingrese el nombre de su pelicula");
            String titulo = input.next();
            peliculaT.add(titulo);
            peli.setTitulo(peliculaT);
            //-----------------------------------------------
            System.out.println("Ingrese el director de la pelicula");
            String director = input.next();
            peliculaD.add(director);
            peli.setDirector(peliculaD);
            //-----------------------------------------------

            System.out.println("Ingrese la duración de la pelicula en horas y minutos");
            double duracion = input.nextDouble();
            peliculaH.add(duracion);
            peli.setDuracion(peliculaH);
            //-----------------------------------------------

            System.out.println("Pelicula agregada correctamente! ¿Desea agregar otra pelicula? S/N");
            op = input.next();

            peliculaC.add(peli);
        } while (!"n".equals(op));
        System.out.println("--------------");
        return peliculaC;
    }

    public void mostrarPelis(ArrayList<CineClass> x) {

        System.out.println("Peliculas en cartelera: ");
        for (int i = 0; i < x.size(); i++) {

            System.out.println(x.get(i).getTitulo().get(i));
        }
    }

    public void mayorHora(ArrayList<CineClass> h) {
        System.out.println("\n------");
        System.out.println("-- Peliculas con duración mayor a 1 hora-- ");

        for (int i = 0; i < h.size(); i++) {
            if (h.get(i).getDuracion().get(i) >= 1) {
                System.out.println(h.get(i).getDuracion().get(i));
            }
        }
    }

    public void ordenMaMe(ArrayList<CineClass> o) {
        System.out.println("\n");
        System.out.println("-- Peliculas ordenadas de mayor a menor-- ");
        for (int i = 0; i < o.size(); i++) {
            Collections.sort(o.get(i).getDuracion());

            System.out.println(o.get(i).getDuracion().get(i));
        }
    }

    public void ordenMeMa(ArrayList<CineClass> o) {
        
       
        System.out.println("\n");
        System.out.println("-- Peliculas ordenadas de mayor a menor-- ");
        Collections.sort(o, (CineClass c1, CineClass c2) -> c2.getDuracion().get(0).compareTo(c1.getDuracion().get(0)));
        
        for (CineClass cine : o) {
            System.out.println(cine.getDuracion());
        }
    }
    
    
    public void tituloOrden(ArrayList<CineClass> t){
        System.out.println("\n");
        System.out.println("-- Peliculas ordenadas de titulo-- ");
        Collections.sort(t.get(0).getTitulo());
        
        System.out.println(t.get(0).getTitulo());
    }
    public void directorOrden(ArrayList<CineClass> d){
        System.out.println("\n");
        System.out.println("-- Peliculas ordenadas por nombre alfabetico del directo-- ");
        Collections.sort(d.get(0).getDirector());
        
        System.out.println(d.get(0).getDirector());
    }
}
