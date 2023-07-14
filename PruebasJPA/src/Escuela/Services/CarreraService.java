/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Escuela.Services;

import Escuela.Entidades.Carrera;
import Escuela.Persistence.CarreraJpaController;
import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author JesusNjo
 */
public class CarreraService {

    CarreraJpaController carre = new CarreraJpaController();

    Scanner input = new Scanner(System.in).useDelimiter("\n").useLocale(Locale.US);

    public void crearCarrera() {
        try {
            Carrera carrera = new Carrera();
            System.out.println("Ingrese el ID de la carrera");
            carrera.setId(input.nextInt());
            System.out.println("Ingrese el nombre de la carrera");
            carrera.setNombre(input.next());
            
            carre.create(carrera);
        } catch (Exception e) {
            throw e;
        }

    }
}
