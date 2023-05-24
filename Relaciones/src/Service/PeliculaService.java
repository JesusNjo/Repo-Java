/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import Ejercicio_5.Peliculas;
import java.util.ArrayList;

/**
 *
 * @author JesusNjo
 */
public class PeliculaService {
    ArrayList<Peliculas> peliculas = new ArrayList();
    
    
    public Peliculas crearPeliculas(){
        Peliculas newP = new Peliculas("Titanic", 2, 15, "Martin Escocerse");
        Peliculas newP1 = new Peliculas("Bastardos sin gloria", 1.50, 18, "Quetin Tarantino");
        Peliculas newP2 = new Peliculas("Super Mario Bross", 2, 8, "Jack black");
        Peliculas newP3 = new Peliculas("Terminator", 2, 16, "James Cameron");
        Peliculas newP4 = new Peliculas("The unsharted", 1.80, 12, "Harry Pont");
       
        peliculas.add(newP);
        peliculas.add(newP1);
        peliculas.add(newP2);
        peliculas.add(newP3);
        peliculas.add(newP4);


        newP.setPeliculas(peliculas);
        
        return newP;
    }
}
