/*
Ejemplo de herencias en Java. Te mostraremos tres tipos de herencia: Simple: la herencia de la clase 
Persona a Profesor Multinivel: la herencia de Persona a Alumno y 
de Alumno a Practicante Jerárquica: la herencia de Persona a Alumno y a Profesor al mismo tiempo3.
 */
package Practicando;

import java.time.Year;
import java.util.*;

/**
 *
 * @author JesusNjo
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        List<Persona> listaColegio = new ArrayList();

        listaColegio.add(new Profesor("Ciencia", Year.of(1994), "Pedro", "López", 2548421));
        listaColegio.add(new Profesor("Matematica", Year.of(2000), "Juan", "Perez", 1848451));
        listaColegio.add(new Profesor("Programación", Year.of(1986), "Elon", "Musk", 485841));

        listaColegio.add(new Alumno("Quimica", Year.of(2010), "Rafael", "Campos", 34848564));
        listaColegio.add(new Alumno("Fisica", Year.of(2011), "Johan", "Pineda", 4248845));
        listaColegio.add(new Alumno("Programación", Year.of(2018), "Francisco", "Naranjo", 4248845));

        for (Persona persona : listaColegio) {

            if (persona instanceof Alumno) {
                if (((Alumno) persona).getMateriaAprendida() == "Quimica") {
                    ((Alumno) persona).setMateriaCursando("Matematica");
                } else if (((Alumno) persona).getMateriaAprendida() == "Fisica") {
                    ((Alumno) persona).setMateriaCursando("Geografia");
                } else {
                    ((Alumno) persona).setMateriaCursando("Bases de datos");

                }
            }
        }

        listaColegio.add(new Practicante("Artistica", Year.of(2015), "Leon", "Salaz", 4784851));
        listaColegio.add(new Practicante("Mineria", Year.of(2020), "Pentis", "Lapiz", 252851));
        listaColegio.add(new Practicante("PolDance", Year.of(2015), "Kings", "League", 624411));

        boolean variable = false;
        for (Persona persona : listaColegio) {
            if (persona instanceof Profesor) {
                if (!variable) {
                    System.out.println("Profesores");
                    System.out.println("--------------------------");
                    variable = true;
                }
                System.out.println(persona.toString());
            }
        }
        variable = false;
        for (Persona persona : listaColegio) {
            if (persona instanceof Alumno && !(persona instanceof Practicante)) {
                if (!variable) {
                    System.out.println("\nAlumnos");
                    System.out.println("--------------------------");
                    variable = true;
                }
                System.out.println(persona.toString());
            }
        }
        variable = false;
        for (Persona persona : listaColegio) {
            if (persona instanceof Practicante) {
                if (!variable) {
                    System.out.println("\nPracticantes");
                    System.out.println("--------------------------");
                    variable = true;
                }
                System.out.println(persona.toString());
            }
        }

    }

}
