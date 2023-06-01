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
public class HacerRuido {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Animal> neu = new ArrayList();
        Animal anim = new Animal();
        Animal perro = new Perro();
        Animal gato = new Gato();

        neu.add(anim);
        neu.add(gato);
        neu.add(perro);
        neu.forEach((x)->x.hacerRuido());
    }
    
}
