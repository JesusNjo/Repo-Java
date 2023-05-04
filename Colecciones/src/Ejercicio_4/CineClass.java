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

import java.util.ArrayList;

/**
 *
 * @author JesusNjo
 */
public class CineClass {
    private ArrayList<String> titulo;
    private ArrayList<String> director;
    private ArrayList<Double> duracion;

    public CineClass(ArrayList<String> titulo, ArrayList<String> director, ArrayList<Double> duracion) {
        this.titulo = titulo;
        this.director = director;
        this.duracion = duracion;
    }

    public CineClass() {
    }

    public ArrayList<String> getTitulo() {
        return titulo;
    }

    public void setTitulo(ArrayList<String> titulo) {
        this.titulo = titulo;
    }

    public ArrayList<String> getDirector() {
        return director;
    }

    public void setDirector(ArrayList<String> director) {
        this.director = director;
    }

    public ArrayList<Double> getDuracion() {
        return duracion;
    }

    public void setDuracion(ArrayList<Double> duracion) {
        this.duracion = duracion;
    }
    
    
    
   
}
