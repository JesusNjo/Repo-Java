/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio_5;

import Service.CineService;
import Service.EspectadorService;
import Service.PeliculaService;

/**
 *
 * @author JesusNjo
 */
public class MainCinema {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        EspectadorService espect = new EspectadorService();
        Espectador espec1 = espect.crearEspec();

        PeliculaService pelicula = new PeliculaService();
        Peliculas peli = pelicula.crearPeliculas();

        CineService cine = new CineService();
        Cine cinema = new Cine();

       
        if(cine.asiento(espec1, peli, cinema)==true){
            
        cine.cineMax();
        }

    }

}
