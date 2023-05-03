/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Practica1;

import colecciones.Clase1.Mascota;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;

/**
 *
 * @author JesusNjo
 */
public class HasHTreeLinked {
    //Collection<Object>;

    //public static Comparator<Mascota> orden = (Mascota o1, Mascota o2) -> o2.getNombre().compareTo(o1.getNombre());

    public static Comparator<Mascota> orden = new Comparator<Mascota>() {

        public int compare(Mascota o1, Mascota o2) {
            return o2.getNombre().compareTo(o1.getNombre());
        }

    };

    public static void main(String[] args) {

    }

}
