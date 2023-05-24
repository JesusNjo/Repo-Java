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

        EspectadorService espc = new EspectadorService();
        Espectador espectador1 = espc.crearEspec();
        CineService x = new CineService();
        Cine cine = x.cineMax();
        PeliculaService peli = new PeliculaService();
        Peliculas peliNue= peli.crearPeliculas();
        
        
        x.asiento(espectador1, peliNue, cine);
        
        
    }

}
