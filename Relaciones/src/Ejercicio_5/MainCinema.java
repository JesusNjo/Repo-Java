/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio_5;

import Service.EspectadorService;

/**
 *
 * @author JesusNjo
 */
public class MainCinema {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        EspectadorService x = new EspectadorService();
        Cine y = new Cine();
        
        y.cineMax();
        
        
    }
    
}
