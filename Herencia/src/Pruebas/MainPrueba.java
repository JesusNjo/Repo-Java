/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pruebas;

import java.util.ArrayList;

/**
 *
 * @author JesusNjo
 */
public class MainPrueba {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        Hoteleria hotel = new Hoteleria();
        
        ArrayList<Hoteleria> hoteles = new ArrayList();
        
        hoteles.add(new Hotel_4(true, "picolino", 'A', 5, 10, 50));
        hoteles.add(new Hotel_4(true, "picolino", 'B', 5,10, 50));
        hoteles.add(new Hotel_4(false, "picolino", 'x', 5, 20, 100));
        
        for (Hoteleria hotele : hoteles) {
            
            System.out.println(hotele);
        }
    }
    
}
