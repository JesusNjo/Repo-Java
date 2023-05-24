/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import Ejercicio_5.Cine;
import Ejercicio_5.Espectador;
import Ejercicio_5.Peliculas;
import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author JesusNjo
 */
public class CineService {

    Scanner input = new Scanner(System.in).useDelimiter("\n").useLocale(Locale.US);

    public Cine cineMax() {
        Cine x = new Cine();
        String[][] sala = new String[8][6];
        int ocu = (int) Math.round(Math.random() * 5);

        System.out.println("\nPorfavor seleccione el asiento que desea ocupar\n");
        System.out.println("Los asientos marcados con una X están ocupados");
       
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 6; j++) {
                sala[i][j] = " ";
            }

        }

        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 6; j++) {
                if (ocu == 1 || ocu == 3) {
                    sala[i][j] = "X";
                    if (i == 2 || i == 3) {
                        break;
                    }
                }
            }

        }
        for (int i = 7; i >= 0; i--) {
            for (int j = 0; j < 6; j++) {
                System.out.print((i + 1) + " " + (char) ('A' + j) + " " + sala[i][j] + " | ");
            }
            System.out.println();
        }

        x.setSala(sala);
        return x;

    }

    public boolean asiento(Espectador espec, Peliculas peli, Cine x) {

        
        if (espec.getDineroD() < x.getPrecio() || espec.getEdad() < peli.getEdadM()) {
            System.out.println("Usted no cumple con los requisitos");
            return false;
        } else {
            System.out.println("Bienvenido");
            return true;
        }
    }

}
