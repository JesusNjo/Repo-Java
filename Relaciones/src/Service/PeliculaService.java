/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import Ejercicio_5.Peliculas;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author JesusNjo
 */
public class PeliculaService {

    ArrayList<Peliculas> peliculas = new ArrayList();
    Scanner input = new Scanner(System.in).useDelimiter("\n").useLocale(Locale.US);

    public Peliculas crearPeliculas() {
        Peliculas peli = new Peliculas();
        Peliculas[] pelicu = {
            new Peliculas("Titanic", 2, 12, "Martin Escocerse"),
            new Peliculas("Bastardos sin gloria", 1.50, 18, "Quetin Tarantino"),
            new Peliculas("Super Mario Bross", 2, 8, "Jack black"),
            new Peliculas("Terminator", 2, 16, "James Cameron"),
            new Peliculas("The unsharted", 1.80, 12, "Harry Pont")
        };

        for (Peliculas peliculas1 : pelicu) {
            peliculas.add(peliculas1);
            peli.setPeliculas(peliculas);
        }

        System.out.println("----------------");

        for (Object pelicula : peli.getPeliculas()) {
            System.out.println(pelicula);

        }
        System.out.println("Indique que pelicula desea ver");
        int pos = input.nextInt();

        System.out.println("-------");

        return pelicu[pos - 1];
    }
}
